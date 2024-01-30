package springboot.swagger.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import springboot.swagger.dto.WorkerDTO;
import lombok.*;

@Data

@AllArgsConstructor
@Entity
@Table(name="workerdetails")
@Schema(description = "Worker Detailed Information")
public class Worker
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Worker Id", example = "111")
    private int id;

    @Column(name = "age")
    @Schema(description = "Worker's Age",example = "44")
    private int age;

    @Column(name = "name")
    @Schema(description = "Worker's Name",example = "Lyon")
    private String name;

    @Column(name = "address")
    @Schema(description = "Worker's Address",example = "67, Paul's Street, Los Angels")
    private String address;


    public Worker(WorkerDTO workerdto) {

        this.age = workerdto.getAge();
        this.name = workerdto.getName();
        this.address = workerdto.getAddress();

    }

    public Worker(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
