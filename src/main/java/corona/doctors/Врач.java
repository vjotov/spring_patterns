package corona.doctors;

import corona.model.Patient;
import corona.treatment.Лечение;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Врач implements Целитель{
    @Autowired
    private List<Лечение> лечениеs;

    private int currentЛечение;

    @Override
    public void исцелять(Patient patient) {
        if (currentЛечение == лечениеs.size()) {
            currentЛечение = 0;
        }
        Лечение лечение = лечениеs.get(currentЛечение++);
        System.out.println("сегодня попробуем: "+лечение.getClass().getSimpleName());
        лечение.применить(patient);
    }
}
