package kapilit;

import org.springframework.stereotype.Component;

@Component
public class HelloSpring {

    public String getMessage() {
        return "Hello, Spring Annotations!";
    }
}
