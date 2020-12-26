package corona.treatment;

import corona.model.Patient;

public class Аспирин implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("Принимать аспирин три раза в день после еды");
    }
}
