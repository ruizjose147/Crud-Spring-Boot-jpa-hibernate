package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.service;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Employee;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Role;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository.IRoleJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    IRoleJpaRepository iRoleJpaRepository;

    public Role crearRole(Role role){
        return iRoleJpaRepository.save(role);
    }

    public List<Role> obtenerRoles(){
        return (List<Role>) iRoleJpaRepository.findAll();
    }
}
