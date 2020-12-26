package corona.api;

import corona.model.BeanMD;
import corona.services.CCL;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanRegistratorController {
    @Autowired
    private GenericApplicationContext context;

    @Autowired
    private CCL ccl;
    // registering bean on the fly
    @SneakyThrows
    @PostMapping("/regbean")
    public String regBean(@RequestBody BeanMD beanMD) {
        Class<?> beanClass = ccl.findClass(beanMD.getBeanClassName());
        BeanDefinitionRegistry beanFactory = (BeanDefinitionRegistry) context.getBeanFactory();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(beanClass);
        beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);

        beanFactory.registerBeanDefinition(beanMD.getBeanName(), beanDefinition);
        context.getBean(beanMD.getBeanName());

        return "registered";
    }
}
