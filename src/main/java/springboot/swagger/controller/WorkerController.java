package springboot.swagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import springboot.swagger.dto.WorkerDTO;
import springboot.swagger.entity.Worker;
import springboot.swagger.repo.WorkerRepo;
import springboot.swagger.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Worker", description = "Worker APIs")  //@Tag Annotations
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
    @Operation(
            summary = "Add Operation",
            description = "Create a Worker records. ")
    @Parameter(description = "Add a Worker")
    public String addworker(@RequestBody WorkerDTO workerdto){

        String id = workerService.addWorker(workerdto);

        return id;
    }

    @GetMapping("/getall")
    @Operation(
            summary = "Get All Operation",
            description = "Display all the Workers Records. ")
    @Parameter(name = "Just Execute" ,description = "Get All Worker")
    public List<Worker> getAllEntities() {
        return workerService.getAllEntities();
    }

    @GetMapping("/getWorker/{id}")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Worker.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", description = "Worker with given Id was not found.", content = { @Content(schema = @Schema()) })
    })
    //@Operation Annotations
    @Operation(
            summary = "Get Operation by ID",
            description = "Get a Worker record by specifying its id. ")
    public Worker getSingleWorker(@Parameter(description = "Search Worker by id")@PathVariable int id){
        return workerService.getSingleWorker(id);
    }

    @GetMapping("/getWorkerbyname/{name}")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Worker.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", description = "Worker with given name was not found.", content = { @Content(schema = @Schema()) })
    })
    @Operation(
            summary = "Get Operation by Name",
            description = "Get a Worker record by specifying its name. ")
    public List<Worker> getWorkerbyname(@Parameter(description = "Search Worker by name")@PathVariable String name){
        return workerService.getWorkerbyname(name);
    }

    @PutMapping("/update/{id}")
    @Operation(
            summary = "Update Operation by ID",
            description = "Update a Worker record by specifying its id. ")
    public String updateWorker(@Parameter(description = "Update Worker by id")@PathVariable int id,@RequestBody WorkerDTO workerdto){
        return workerService.updateWorker(id,workerdto);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(
            summary = "Delete Operation by ID",
            description = "Delete a Worker record by specifying its id. ")
    public String deleteWorker(@Parameter(description = "Delete Worker by id")@PathVariable int id){
        String ids = workerService.deleteWorker(id);
        return ids;
    }

}
