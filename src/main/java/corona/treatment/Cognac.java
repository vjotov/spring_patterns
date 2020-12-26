package corona.treatment;

import corona.model.Patient;

@Treatment(type = ITreatment.АЛКОГОЛЬ)
public class Cognac implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("Дышать над коньячными парами в течении часа 4 раза в день перед сном");
    }
}
