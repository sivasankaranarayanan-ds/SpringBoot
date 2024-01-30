package dockerCompose.Employee1.Controller;

import dockerCompose.Employee1.DTO.EmployeeDTO;
import dockerCompose.Employee1.Repo.EmpRepo;
import dockerCompose.Employee1.entity.Employee;
import dockerCompose.Employee1.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class EmployeeController
{
    @Autowired
    private EmployeeServices empServices;
    @Autowired
    private EmpRepo employeeRepo;

    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeDTO empdto){

        String id = empServices.addEmployee(empdto);

        return id;
    }


    @GetMapping("/getall")
    public List<Employee> getAllEntities() {
        return empServices.getAllEntities();
    }

    @GetMapping("/getEmp/{id}")
    public Employee getSingleEmployee(@PathVariable int id){
        return empServices.getSingleEmp(id);
    }

    @GetMapping("/getEmpbyname/{name}")
    public List<Employee> getEmployeebyname(@PathVariable String name){
        return empServices.getEmployeebyname(name);
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id,@RequestBody EmployeeDTO employeeDTO){
        return empServices.updateEmp(id,employeeDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        String ids = empServices.deleteEmp(id);
        return ids;
    }
}
