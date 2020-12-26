package corona.treatment;

import corona.model.Patient;

@Treatment(type= "alcohol")
public class Коньяк implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("Дышать над коньячными парами в течении часа 4 раза в день перед сном");
    }
}
