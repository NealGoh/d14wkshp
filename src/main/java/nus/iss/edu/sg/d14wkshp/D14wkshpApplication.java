package nus.iss.edu.sg.d14wkshp;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class D14wkshpApplication {

	public static void main(String[] args) {
		//SpringApplication.run(D14wkshpApplication.class, args);

		//Setting the default port to 8085
		SpringApplication app = new SpringApplication(D14wkshpApplication.class);

		String port = "8085";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(
			Collections.singletonMap("server.port", port)
		);

		app.run(args);
		//Setting the default port to 8085
		//Command Line to choose which port to run on (mvn spring-boot:run -Dspring-boot.run.arguments="--port=8080")
	}

	//If want to debug
	@Bean
	public CommonsRequestLoggingFilter log() {
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);
		return logger;
	}
	//If want to debug
}
