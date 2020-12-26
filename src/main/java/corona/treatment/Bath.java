package corona.treatment;

import corona.model.Patient;

public class Bath implements ITreatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("три захода в баню, по 10 минут при температуре в 3 раза превышающей температуру тела");
    }
}
