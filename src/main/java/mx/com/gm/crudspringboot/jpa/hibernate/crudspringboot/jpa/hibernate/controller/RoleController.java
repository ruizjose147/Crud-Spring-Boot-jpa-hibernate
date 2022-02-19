package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.controller;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Employee;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Role;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping("/role")
    public Role createRole(@RequestBody Role role){
        return this.roleService.crearRole(role);
    }

    @GetMapping("/roles")
    public List<Role> obtenerRoles(){
        return roleService.obtenerRoles();
    }
}
