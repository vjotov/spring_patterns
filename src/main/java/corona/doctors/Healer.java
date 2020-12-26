package corona.doctors;

import corona.model.Patient;

public interface Healer {

    void heal(Patient patient);

    String TRADITIONAL = "traditional";
    String FOLK = "folk";
}
