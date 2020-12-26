package corona.doctors;

import corona.model.Patient;
import corona.treatment.ITreatment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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

    @Override
    public String myType() {
        return Healer.TRADITIONAL;
    }
}
