package dio.padroesComSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesComSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesComSpringApplication.class, args);
	}

	///////Em desenvolvimento

}
