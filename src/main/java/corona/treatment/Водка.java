package corona.treatment;

import corona.model.Patient;

@Treatment(type= "alcohol")
public class Водка implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("100 грамм водки внутрь, три раза перед каждой едой");
    }
}
