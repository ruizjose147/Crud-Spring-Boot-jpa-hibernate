package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.controller;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Project;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Role;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.service.ProjectService;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping("/project")
    public Project createProject(@RequestBody Project project){
        return this.projectService.crearProject(project);
    }

    @GetMapping("/projects")
    public List<Project> obtenerProjects(){
        return projectService.obterProjects();
    }
}
