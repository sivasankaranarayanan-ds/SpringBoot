package springboot.swagger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.swagger.entity.Worker;

import java.util.List;

public interface WorkerRepo extends JpaRepository<Worker,Integer>
{
    List<Worker> findByName(String name);
}
