package corona.treatment;

import corona.model.Patient;

@Treatment
public class Smoke implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("нюхать дым, стучать в барабан до полного исцеления");
    }
}
