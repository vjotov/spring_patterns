package corona.treatment;

import corona.model.Patient;

@Treatment
public class Acupuncture implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("Втыкать иголки на глубину 2 милитра по всему позвоночнику, через полчаса звонить в скорую");
    }
}
