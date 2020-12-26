package corona.api;

import corona.model.Patient;
import corona.services.Hospital;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/corona/")
public class CoronaController {
    private final Hospital hospital;

    public CoronaController(Hospital hospital) {
        this.hospital = hospital;
    }

    //    private final
    @PostMapping("treat")
    public Patient treat(@RequestBody Patient patient) {
        hospital.processPatient(patient);
        return patient;
    }

    // registering bean on the fly
    @SneakyThrows
    @PostMapping("/regbean")
    public String regBean(@RequestBody BeanMD beanMD) {
        return "registered";
    }
}
