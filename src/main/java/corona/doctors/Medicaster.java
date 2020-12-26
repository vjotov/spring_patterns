package corona.doctors;

import corona.InjectList;
import corona.model.Patient;
import corona.treatment.Bath;
import corona.treatment.Vodka;
import corona.treatment.ITreatment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Medicaster implements Healer {
    @Autowired
    @InjectList({Vodka.class, Bath.class})
    private List<ITreatment> treatments;

    @Override
    public void heal(Patient patient) {
        System.out.println("определяю лечение...");
        treatments.forEach(treatment -> treatment.apply(patient));
    }

    @Override
    public String myType() {
        return Healer.FOLK;
    }
}
