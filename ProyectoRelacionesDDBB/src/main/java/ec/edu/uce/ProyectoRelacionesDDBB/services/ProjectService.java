package ec.edu.uce.ProyectoRelacionesDDBB.services;

import ec.edu.uce.ProyectoRelacionesDDBB.models.Project;
import ec.edu.uce.ProyectoRelacionesDDBB.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}
