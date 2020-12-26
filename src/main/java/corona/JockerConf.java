package corona;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JockerConf {
    @Bean
    public InjectListBPP injectListBPP() {
        return new InjectListBPP();
    }
}
