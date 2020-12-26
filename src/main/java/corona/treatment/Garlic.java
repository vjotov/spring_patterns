package corona.treatment;

import corona.model.Patient;

@Treatment
public class Garlic implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("Вставить ческнок в ущи, нос и рот, крутить по часовой стрелке во время еды, до конца пандемии");
    }
}
