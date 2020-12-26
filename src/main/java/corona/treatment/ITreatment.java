package corona.treatment;

import corona.model.Patient;

@Treatment
public interface ITreatment {
    void apply(Patient patient);
    String АЛКОГОЛЬ = "alcohol";
}
