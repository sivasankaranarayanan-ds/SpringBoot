package springboot.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerApplication {
	//Swagger is a set of open-source tools and specifications for designing, building, documenting, and consuming RESTful APIs.
	// It includes a range of tools, including Swagger Editor, Swagger UI, and Swagger Codegen,
	// that work together to enable developers to create and manage APIs effectively.

	//Swagger Annotations:
	//   1)Tag annotation
	//   2)Operation annotation
	//   3)@ApiResponses and @ApiResponse annotation
	//   4)Parameter annotation
	//   5)Schema annotation
	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}
}
