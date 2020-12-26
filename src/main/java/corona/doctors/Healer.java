package corona.doctors;

import corona.model.Patient;

public interface Healer {

    void heal(Patient patient);
    String myType();

    String TRADITIONAL = "traditional";
    String FOLK = "folk";
}
