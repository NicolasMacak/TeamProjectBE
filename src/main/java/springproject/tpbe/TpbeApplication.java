package springproject.tpbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TpbeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpbeApplication.class, args);
    }

    @RestController
    static final class MyController {
        
        @GetMapping("/")
        String hello(){
            return "Hello darkness my old friend";
        }
    }
}
