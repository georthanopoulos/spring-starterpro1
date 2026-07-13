package gr.aueb.cf.starterpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterproApplication {                                   // Here is the entry point for every spring project. See annotation above. From here the whole project gets started and executed!

	public static void main(String[] args) {                           //Scans - imports the IoC container and then starts the Tomcat web server.
		SpringApplication.run(StarterproApplication.class, args);
	}

}
