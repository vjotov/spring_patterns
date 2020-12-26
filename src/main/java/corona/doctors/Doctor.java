package corona.doctors;

import corona.model.Patient;
import corona.treatment.ITreatment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Doctor implements Healer {
    @Autowired
    private List<ITreatment> treatments;

    private int currentTreatment;

    @Override
    public void heal(Patient patient) {
        if (currentTreatment == treatments.size()) {
            currentTreatment = 0;
        }
        ITreatment лечение = treatments.get(currentTreatment++);
        System.out.println("сегодня попробуем: "+лечение.getClass().getSimpleName());
        лечение.apply(patient);
    }
}
