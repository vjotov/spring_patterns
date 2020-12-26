package corona.treatment;

import corona.model.Patient;

public class Дым implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("нюхать дым, стучать в барабан до полного исцеления");
    }
}
