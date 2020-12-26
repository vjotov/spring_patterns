package corona.doctors;

import corona.model.Patient;
import corona.treatment.ITreatment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class DefaultHealer implements Healer {
    @Autowired
    private List<ITreatment> allTreatments;

    private Random random = new Random();

    @Override
    public void heal(Patient patient) {
        allTreatments.get(random.nextInt(allTreatments.size())).apply(patient);
    }
}
