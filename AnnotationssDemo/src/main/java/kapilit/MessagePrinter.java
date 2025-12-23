package kapilit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private final HelloSpring helloSpring;

    // Constructor injection using @Autowired
    @Autowired
    public MessagePrinter(HelloSpring helloSpring) {
        this.helloSpring = helloSpring;
    }

    public void printMessage() {
        System.out.println(helloSpring.getMessage());
    }
}
