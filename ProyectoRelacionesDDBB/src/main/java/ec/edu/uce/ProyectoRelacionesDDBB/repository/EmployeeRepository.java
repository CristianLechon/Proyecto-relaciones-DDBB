package ec.edu.uce.ProyectoRelacionesDDBB.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
