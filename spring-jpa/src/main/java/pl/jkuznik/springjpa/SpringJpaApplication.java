package pl.jkuznik.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runApp(UserRepository userRepository){

		return (args -> {
			Iterable<User> users = userRepository.findAll();

			for (User user : users){
				System.out.println(user.getId());
				System.out.println(user.getDisplayName());
				System.out.println();
			}
		});
	}

}
