package NTTDATA.msmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsmanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsmanageApplication.class, args);
	}

}
