package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.service;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Employee;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository.IEmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService{

    @Autowired
    IEmployeeJpaRepository iEmployeeJpaRepository;

    public List<Employee> obtenerEmpleados(){
        return (List<Employee>) iEmployeeJpaRepository.findAll();
    }

    public Employee crearEmployee(Employee employee){
        return iEmployeeJpaRepository.save(employee);
    }

    public Optional<Employee> obtenerPorId(Long id){
        return iEmployeeJpaRepository.findById(id);
    }

    public boolean eliminarEmployee(long id){
        try {
            iEmployeeJpaRepository.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
