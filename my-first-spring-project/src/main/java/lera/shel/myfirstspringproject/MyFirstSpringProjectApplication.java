package lera.shel.myfirstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("lera.shel.myfirstspringproject")
@EntityScan("lera.shel.myfirstspringproject")
@SpringBootApplication
public class MyFirstSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringProjectApplication.class, args);
	}

}
