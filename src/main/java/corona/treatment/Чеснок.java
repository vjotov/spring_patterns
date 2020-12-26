package corona.treatment;

import corona.model.Patient;

public class Чеснок implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("Вставить ческнок в ущи, нос и рот, крутить по часовой стрелке во время еды, до конца пандемии");
    }
}
