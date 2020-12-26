package corona.treatment;

import corona.Patient;

@Treatment(type= Лечение.АЛОГОЛ)
public class Водка implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("100 грамм водки внутрь, три раза в день");
    }
}
