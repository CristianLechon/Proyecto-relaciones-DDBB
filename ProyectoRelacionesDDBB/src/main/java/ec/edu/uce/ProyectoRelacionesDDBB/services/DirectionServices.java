package ec.edu.uce.ProyectoRelacionesDDBB.services;

import ec.edu.uce.ProyectoRelacionesDDBB.models.Direction;
import ec.edu.uce.ProyectoRelacionesDDBB.repository.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionServices {

    @Autowired
    private DirectionRepository directionRepository;

    public List<Direction> getAllDirections() {
        return directionRepository.findAll();
    }

    public Direction saveDirectionRepository(Direction direction) {
        return directionRepository.save(direction);
    }

}
