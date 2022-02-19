package mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate;

import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Employee;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Project;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.model.Role;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository.IEmployeeJpaRepository;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository.IProjectJpaRepository;
import mx.com.gm.crudspringboot.jpa.hibernate.crudspringboot.jpa.hibernate.repository.IRoleJpaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class EmployeeJpaRepositoryTest {
    @Autowired
    private IEmployeeJpaRepository repoEmpl;

    @Autowired
    private IRoleJpaRepository repoRole;

    @Autowired
    private IProjectJpaRepository repoProj;

    @Test
    public void saveEmployee(){
        Role admin = new Role("ROLE_ADMIN");
        Role dev = new Role("ROLE_DEV");

        admin = repoRole.save(admin);
        dev = repoRole.save(dev);

        Project proj1 = new Project("proj1");
        Project proj2 = new Project("proj2");
        Project proj3 = new Project("proj3");

        proj1 = repoProj.save(proj1);
        proj2 = repoProj.save(proj2);
        proj3 = repoProj.save(proj3);

        Employee jose = new Employee("jose", "ruiz", "empl123", dev);
        Employee silvia = new Employee("silvia", "vellojin", "empl345", admin);

        jose.getProjects().add(proj1);
        jose.getProjects().add(proj2);

        silvia.getProjects().add(proj1);
        silvia.getProjects().add(proj2);
        silvia.getProjects().add(proj3);

        repoEmpl.save(jose);
        repoEmpl.save(silvia);

        repoEmpl.flush();

        Employee empl124 = repoEmpl.findByEmployeeId("empl124");
        Assertions.assertEquals(2, repoEmpl.findAll().size());
        //assertEquals(2, repo.findAll().size());
        // TODO: 18/02/2022 revisar esta parte
    }
}
