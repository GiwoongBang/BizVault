package world.girin.bizvault.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Security Check";
    }

    @GetMapping("/healthcheck")
    public String healthcheck() {

        return "ok";
    }

}