package corona.treatment;

import corona.model.Patient;

@Treatment
public class Amulet implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("Носить на шее маску. Не снимать ни в душе ни во сне");
    }
}
