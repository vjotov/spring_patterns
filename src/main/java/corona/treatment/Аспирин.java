package corona.treatment;

import corona.Patient;

public class Аспирин implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("100 грамм водки внутрь, три раза в день");
    }
}
