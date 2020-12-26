package corona;

import corona.treatment.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Знахарь implements Целитель{
    @Autowired
    private Лечение водка;

    @Override
    public void исцелять(Patient patient) {
        System.out.println("определяю лечение...");
    }
}
