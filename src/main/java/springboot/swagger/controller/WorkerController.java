package springboot.swagger.controller;

import springboot.swagger.dto.WorkerDTO;
import springboot.swagger.entity.Worker;
import springboot.swagger.repo.WorkerRepo;
import springboot.swagger.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class WorkerController
{
    @Autowired
    private WorkerService workerService;
    @Autowired
    private WorkerRepo workerRepo;

    @PostMapping("/add")
    public String addworker(@RequestBody WorkerDTO workerdto){

        String id = workerService.addWorker(workerdto);

        return id;
    }


    @GetMapping("/getall")
    public List<Worker> getAllEntities() {
        return workerService.getAllEntities();
    }

    @GetMapping("/getWorker/{id}")
    public Worker getSingleWorker(@PathVariable int id){
        return workerService.getSingleWorker(id);
    }

    @GetMapping("/getWorkerbyname/{name}")
    public List<Worker> getWorkerbyname(@PathVariable String name){
        return workerService.getWorkerbyname(name);
    }

    @PutMapping("/update/{id}")
    public String updateWorker(@PathVariable int id,@RequestBody WorkerDTO workerdto){
        return workerService.updateWorker(id,workerdto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteWorker(@PathVariable int id){
        String ids = workerService.deleteWorker(id);
        return ids;
    }

}
