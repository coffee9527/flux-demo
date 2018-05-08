package top.pancras.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by pancras on 2018/5/8 0008.
 */
@RestController
public class BasicController {
    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Hello World");
    }
}
