package corona;

import corona.doctors.Healer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
//@Import(LegacyBeanDefinitionRegistrar.class)
//https://youtu.be/GL1txFxswHA?t=5325
public class JockerConf {
//    @Bean
//    // https://youtu.be/GL1txFxswHA?t=6785
//    public Map<String, Healer> hospitalMap(List<Healer> healers) {
//        return healers.stream().collect(Collectors.toMap(Healer::myType, Function.identity()));
//    }

    @Bean
    public InjectListBPP injectListBPP() {
        return new InjectListBPP();
    }
}
