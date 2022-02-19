package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Employee;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Project;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeJpaRepository extends JpaRepository<Employee, Long> {

    public Employee findByEmployeeId(String employeeId);
    public List<Employee> findByLastName(String lastName);
    public List<Employee> findByRole(Role role);

}
