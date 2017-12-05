package io.github.mahendrabagul.springibmbluemixsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringIbmbluemixSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringIbmbluemixSampleApplication.class, args);
	}

	@RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String home() {
		return "Nothing here. Go to <a href='/api/sample'>/sample</a>";
	}
}
