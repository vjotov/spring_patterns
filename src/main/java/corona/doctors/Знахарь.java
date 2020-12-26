package corona.doctors;

import corona.InjectList;
import corona.model.Patient;
import corona.treatment.Баня;
import corona.treatment.Водка;
import corona.treatment.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Знахарь implements Целитель {
    @Autowired
    @InjectList({Водка.class, Баня.class})
    private List<Лечение> личениеs;

    @Override
    public void исцелять(Patient patient) {
        System.out.println("определяю лечение...");
    }
}
