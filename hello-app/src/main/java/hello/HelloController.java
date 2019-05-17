package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    private static int value = 0;
    
	@RequestMapping("/")
    public String index() {
		value++;
        return String.format("Greetings %d from Spring Boot!!", value);
    }

}