package corona.services;

import corona.doctors.Healer;
import corona.model.Patient;

public interface Hospital {
    // solution 1 - creating in the constructor
//    public NewHospitalImpl(List<Healer> healers) {
//        map = healers.stream().collect(Collectors.toMap(Healer::myType, Function.identity()));
//    }
    void register(String key, Healer healer);

    void processPatient(Patient patient);
}
