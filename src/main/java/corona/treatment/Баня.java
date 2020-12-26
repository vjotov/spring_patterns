package corona.treatment;

import corona.model.Patient;

public class Баня implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("три захода в баню, по 10 минут при температуре в 3 раза превышающей температуру тела");
    }
}
