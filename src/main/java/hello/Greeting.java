package hello;

public class Greeting {

    private final String greeting;

    Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getContent() {
        return greeting;
    }
}