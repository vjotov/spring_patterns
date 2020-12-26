package corona.doctors;

import corona.model.Patient;
import corona.services.Hospital;
import org.springframework.beans.factory.annotation.Autowired;

public interface Healer {

    void heal(Patient patient);
    String myType();

    // https://youtu.be/GL1txFxswHA?t=7889
    // here 3rd - setter injection, 1st is field injection, 2nd is constructor injection
    @Autowired
    default void regMe(Hospital hospital) {
        hospital.register(myType(), this);
    }

    String TRADITIONAL = "traditional";
    String FOLK = "folk";
}
