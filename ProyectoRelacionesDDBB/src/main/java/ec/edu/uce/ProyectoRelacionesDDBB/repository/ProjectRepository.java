package ec.edu.uce.ProyectoRelacionesDDBB.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
