package corona.services;

import corona.doctors.DefaultHealer;
import corona.doctors.Healer;
import corona.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class NewHospitalImpl implements Hospital {
    //    @Autowired
    // solution 2 - bean is in the configuration
    private Map<String, Healer> map;

    // solution 1 - creating in the constructor
    public NewHospitalImpl(List<Healer> healers) {
        map = healers.stream().collect(Collectors.toMap(Healer::myType, Function.identity()));
    }

    @Override
    public void processPatient(Patient patient) {
        Healer healer = map.getOrDefault(patient.getMethod(), new DefaultHealer());
        healer.heal(patient);
    }
}
