package ec.edu.uce.ProyectoRelacionesDDBB;

import ec.edu.uce.ProyectoRelacionesDDBB.models.Department;
import ec.edu.uce.ProyectoRelacionesDDBB.models.Direction;
import ec.edu.uce.ProyectoRelacionesDDBB.models.Employee;
import ec.edu.uce.ProyectoRelacionesDDBB.models.Project;
import ec.edu.uce.ProyectoRelacionesDDBB.services.DepartmentService;
import ec.edu.uce.ProyectoRelacionesDDBB.services.DirectionServices;
import ec.edu.uce.ProyectoRelacionesDDBB.services.EmployeeService;
import ec.edu.uce.ProyectoRelacionesDDBB.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

/**
 *
 * @author Cristian Lechon.
 * Titulo: Proyecto relaciones DDBB.
 *
 *
 */

@SpringBootApplication
public class ProyectoRelacionesDdbbApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProjectService projectService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private DirectionServices directionServices;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Direction direction = new Direction();
		direction.setStreet("AV. 10 de agosto");
		direction.setCity("Quito");

		Department department = new Department();
		department.setName("Departamento de soporte");

		Project project1 = new Project();
		project1.setName("Projecto OpenGL");

		Project project2 = new Project();
		project2.setName("Projecto Galaga");

		Employee employee = new Employee();
		employee.setName("Cristian Lechon");
		employee.setDirection(direction);
		employee.setDepartment(department);
		employee.setProjects(Set.of(project1, project2));

		employeeService.saveEmployee(employee);


		
		employeeService.getAllEmployees().forEach(System.out::println);
		directionServices.getAllDirections().forEach(System.out::println);
		departmentService.getAllDepartments().forEach(System.out::println);
		projectService.getAllProjects().forEach(System.out::println);

	}
}
