package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.service;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Project;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Role;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository.IProjectJpaRepository;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository.IRoleJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    IProjectJpaRepository iProjectJpaRepository;

    public Project crearProject(Project project){
        return iProjectJpaRepository.save(project);
    }

    public List<Project> obterProjects(){
        return (List<Project>) iProjectJpaRepository.findAll();
    }
}
