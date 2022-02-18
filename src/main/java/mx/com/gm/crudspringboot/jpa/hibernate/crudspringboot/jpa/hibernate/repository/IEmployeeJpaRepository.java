package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeJpaRepository extends JpaRepository<Employee,Long> {

    Employee findByEmployeeId(String employeeId);


}
