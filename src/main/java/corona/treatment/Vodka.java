package corona.treatment;

import corona.model.Patient;

@Treatment(type= ITreatment.АЛКОГОЛЬ)
public class Vodka implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("100 грамм водки внутрь, три раза перед каждой едой");
    }
}
