package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

    @JsonProperty("greeting")
    private final String content;

    Greeting(String greeting) {
        this.content = greeting;
    }

    public String getContent() {
        return content;
    }
}