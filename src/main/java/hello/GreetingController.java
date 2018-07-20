package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/api/greeting")
    public String apigreeting() {
        return "Hello JSON";
    }

    @RequestMapping("/api/greeting/{usernames}")
    public Greeting greeting(@PathVariable(value = "usernames") String name) {
        return new Greeting(String.format(template, UpperFirstLetter.MakeUpper(name)));
    }
}
