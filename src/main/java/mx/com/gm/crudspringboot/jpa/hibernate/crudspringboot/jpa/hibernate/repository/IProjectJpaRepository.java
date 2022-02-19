package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectJpaRepository extends JpaRepository<Project, Long> {

}
