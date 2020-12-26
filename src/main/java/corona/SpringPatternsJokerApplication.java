package corona;

import corona.doctors.Medicaster;
import corona.model.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPatternsJokerApplication {
    public static void main(String[] agrs) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPatternsJokerApplication.class, agrs);

        context.getBean(Medicaster.class).heal(Patient.builder().build());
    }
}
