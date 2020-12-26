package corona.treatment;

import corona.model.Patient;

public class Jars implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("12 банок, присосать к спине на пол часа перед сном");
    }
}
