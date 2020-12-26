package corona.treatment;

import corona.model.Patient;

@Treatment
public class Aspirin implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("Принимать аспирин три раза в день после еды");
    }
}
