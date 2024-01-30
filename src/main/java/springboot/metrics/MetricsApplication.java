package springboot.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetricsApplication {
	public static void main(String[] args)
	{
		SpringApplication.run(MetricsApplication.class, args);
	}
	//Metrics are quantifiable measurements that provide a view into the performance, behavior,
	// and health of an application. They can include a wide range of data points,
	//from CPU and memory usage to more application-specific metrics
	// like the number of active user sessions or the rate of incoming requests.
}
