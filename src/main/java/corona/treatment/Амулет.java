package corona.treatment;

import corona.model.Patient;

public class Амулет implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("Носить на шее маску. Не снимать ни в душе ни во сне");
    }
}
