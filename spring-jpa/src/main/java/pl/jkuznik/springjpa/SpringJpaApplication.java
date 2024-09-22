package pl.jkuznik.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runApp(UserRepository userRepository){

		return (args -> {

			userRepository.save(new Users("admin"));

			Optional<Users> byId = userRepository.findById(1);
            byId.ifPresent(value -> System.out.println(value.getLogin()));
		});
	}

}
