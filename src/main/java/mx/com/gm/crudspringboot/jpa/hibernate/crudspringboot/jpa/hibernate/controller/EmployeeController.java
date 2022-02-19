package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.controller;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Employee;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> obtenerEmployees(){
        return employeeService.obtenerEmpleados();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return this.employeeService.crearEmployee(employee);
    }

    @GetMapping("/tutorials/{id}")
    public Optional<Employee> obtenerPorId(@PathVariable("id") long id){
        return this.employeeService.obtenerPorId(id);
    }

    @DeleteMapping("/tutorials/{id}")
    public String eliminarPorId(@PathVariable("id") long id){
        boolean ok = this.employeeService.eliminarEmployee(id);
        if(ok){
            return "Se elimino el usuario con id " + id;
        }else {
            return "No se pudo eliminar el usuario con id" + id;
        }
    }
}