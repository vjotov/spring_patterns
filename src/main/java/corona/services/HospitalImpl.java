package corona.services;

import corona.doctors.DefaultHealer;
import corona.doctors.Doctor;
import corona.doctors.Medicaster;
import corona.doctors.Healer;
import corona.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalImpl implements Hospital {
    @Autowired
    private Medicaster знахарь;
    @Autowired
    private Doctor врач;
    @Autowired
    private DefaultHealer defaultHealer;

    @Override
    public void processPatient(Patient patient) {
        switch (patient.getMethod()) {
            case Healer.TRADITIONAL:
                врач.heal(patient);
                break;
            case Healer.FOLK:
                знахарь.heal(patient);
                break;
            default:
                defaultHealer.heal(patient);
        }
    }
}