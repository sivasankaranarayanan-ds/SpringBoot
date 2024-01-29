package springboot.swagger.service;

import org.springframework.stereotype.Service;
import springboot.swagger.dto.WorkerDTO;
import springboot.swagger.entity.Worker;
import springboot.swagger.repo.WorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

@Service
public class WorkerService
{
    @Autowired
    private WorkerRepo workerRepo;

    public String addWorker(WorkerDTO workerdto) {

        Worker worker = new Worker(workerdto);

        Worker saveworker = workerRepo.save(worker);

        return saveworker.toString();
    }

    public String deleteWorker(int id) {
        try {
            workerRepo.deleteById(id);
            return "Worker deleted successfully.";
        } catch (EmptyResultDataAccessException e) {
            // Handle the case where the worker with the given ID is not found
            return "Worker not found with ID: " + id;
        } catch (Exception e) {
            // Handle other exceptions (e.g., database connection issues)

            return "Error deleting worker with ID: " + e;
        }
    }

    public String updateWorker(int id, WorkerDTO workerdto) {

        if (workerRepo.existsById(id)) {
            Worker existingWorker = workerRepo.getReferenceById(id);
            existingWorker.setAge(workerdto.getAge() != 0 ? workerdto.getAge() : existingWorker.getAge());
            existingWorker.setAddress(workerdto.getAddress() != null ? workerdto.getAddress() : existingWorker.getAddress());
            existingWorker.setName(workerdto.getName() != null ? workerdto.getName() : existingWorker.getName());
            workerRepo.save(existingWorker);


        }
        else
        {
            System.out.println("Worker ID "+id+"do not Exist");
        }
        return null;
    }

    public List<Worker> getAllEntities() {
        return workerRepo.findAll();
    }

    public Worker getSingleWorker(int id) {
        return workerRepo.findById(id).orElse(null);
    }

    public List<Worker> getWorkerbyname(String name) {
        return workerRepo.findByName(name);
    }
}
