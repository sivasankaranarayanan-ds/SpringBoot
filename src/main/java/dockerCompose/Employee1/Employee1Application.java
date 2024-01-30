package dockerCompose.Employee1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Employee1Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Employee1Application.class, args);
	}
	//Docker Compose is a tool for defining and running multi-container Docker applications.
	//It allows you to use a YAML file to configure the services, networks, and volumes required for your application,
	//making it easier to define and manage complex Docker-based environments.
}
