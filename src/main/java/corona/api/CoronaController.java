package corona.api;

import corona.model.Patient;
import corona.model.PatientStatus;
import corona.services.Hospital;
import corona.services.pcr.PSRService;
import org.springframework.web.bind.annotation.*;

import static java.time.LocalDateTime.now;

@RestController
@RequestMapping("/corona/")
public class CoronaController {
    private final Hospital hospital;
    private final PSRService diagnoseService;

    public CoronaController(Hospital hospital, PSRService diagnoseService) {
        this.hospital = hospital;
        this.diagnoseService = diagnoseService;
    }

    //    private final
    @PostMapping("treat")
    public Patient treat(@RequestBody Patient patient) {
        hospital.processPatient(patient);
        return patient;
    }

    @GetMapping("diagnose")
    public PatientStatus getPatientStatus() {
        return new PatientStatus(diagnoseService.isPositive(),now());
    }

}
