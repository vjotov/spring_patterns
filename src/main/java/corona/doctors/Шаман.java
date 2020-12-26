package corona.doctors;

import corona.model.Patient;

public class Шаман implements Healer {
    @Override
    public void heal(Patient patient) {
        System.out.println("Шаман");
    }

    @Override
    public String myType() {
        return "магия";
    }
}
