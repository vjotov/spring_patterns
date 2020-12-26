package corona.services;

import corona.doctors.DefaultHealer;
import corona.doctors.Doctor;
import corona.doctors.Medicaster;
import corona.doctors.Healer;
import corona.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

//@Service
public class HospitalImpl implements Hospital {
    @Autowired
    @Lazy
    private Medicaster medicaster;
    @Autowired
    @Lazy
    private Doctor doctor;
    @Autowired
    private DefaultHealer defaultHealer;

    @Override
    public void processPatient(Patient patient) {
        switch (patient.getMethod()) {
            case Healer.TRADITIONAL:
                doctor.heal(patient);
                break;
            case Healer.FOLK:
                medicaster.heal(patient);
                break;
            default:
                defaultHealer.heal(patient);
        }
    }

    @Override
    public void register(String key, Healer healer) {

    }
}