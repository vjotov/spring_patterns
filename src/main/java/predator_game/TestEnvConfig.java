package predator_game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// use of lazyInit = true for loading only of necessary beans
// use in application.properties:
// spring.main.lazy-initialization=true
@ComponentScan(lazyInit = true)
public class TestEnvConfig {
//    @Bean
//    public Predator getPredator() {
//        return new Predator();
//    }
}
