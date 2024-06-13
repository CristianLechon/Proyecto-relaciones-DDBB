package ec.edu.uce.ProyectoRelacionesDDBB.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
