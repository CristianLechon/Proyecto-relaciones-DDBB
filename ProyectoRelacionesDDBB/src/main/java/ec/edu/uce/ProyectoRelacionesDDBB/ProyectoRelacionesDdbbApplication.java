package ec.edu.uce.ProyectoRelacionesDDBB;

import ec.edu.uce.ProyectoRelacionesDDBB.models.Department;
import ec.edu.uce.ProyectoRelacionesDDBB.models.Direction;
import ec.edu.uce.ProyectoRelacionesDDBB.models.Employee;
import ec.edu.uce.ProyectoRelacionesDDBB.models.Project;
import ec.edu.uce.ProyectoRelacionesDDBB.services.EmployeeService;
import ec.edu.uce.ProyectoRelacionesDDBB.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class ProyectoRelacionesDdbbApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProjectService projectService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Direction direction = new Direction();
		direction.setStreet("123 Fake Street");
		direction.setCity("Fictional City");

		Department department = new Department();
		department.setName("Development");

		Project project1 = new Project();
		project1.setName("Project Alpha");

		Project project2 = new Project();
		project2.setName("Project Beta");

		Employee employee = new Employee();
		employee.setName("John Doe");
		employee.setDirection(direction);
		employee.setDepartment(department);
		employee.setProjects(Set.of(project1, project2));

		// Save entities
		employeeService.saveEmployee(employee);

		// Display all employees
		employeeService.getAllEmployees().forEach(System.out::println);

	}
}
