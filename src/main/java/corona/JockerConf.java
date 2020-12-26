package corona;

import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    @Bean
    public CustomPointCut customPointCut() {
        return new CustomPointCut();
    }

    @Bean
    public ExceptionHandlerAspect exceptionHandlerAspect() {
        return new ExceptionHandlerAspect();
    }

    @Bean
    public DefaultPointcutAdvisor advisor() {
        return new DefaultPointcutAdvisor(customPointCut() , exceptionHandlerAspect());
    }
}
