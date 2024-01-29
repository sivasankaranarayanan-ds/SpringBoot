package springboot.swagger.entity;

import jakarta.persistence.*;
import springboot.swagger.dto.WorkerDTO;
import lombok.*;

@Data

@AllArgsConstructor
@Entity
@Table(name="workerdetails")
public class Worker
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "age")
    private int age;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
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
