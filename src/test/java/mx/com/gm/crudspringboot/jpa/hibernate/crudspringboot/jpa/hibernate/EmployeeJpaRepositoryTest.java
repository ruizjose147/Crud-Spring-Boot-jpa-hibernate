package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Employee;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository.IEmployeeJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class EmployeeJpaRepositoryTest {
    @Autowired
    private IEmployeeJpaRepository repo;

    @Test
    public void saveEmployee(){
        Employee jose = new Employee("jose", "ruiz", "empl123");
        Employee silvia = new Employee("silvia", "vellojin", "empl345");
        repo.save(jose);
        repo.save(silvia);

        repo.flush();

        //assertEquals(2, repo.findAll().size());
        // TODO: 18/02/2022 revisar esta parte
    }
}
