package corona.treatment;

import corona.model.Patient;

public class Банки implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("12 банок, присосать к спине на пол часа перед сном");
    }
}
