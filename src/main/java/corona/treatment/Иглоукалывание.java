package corona.treatment;

import corona.model.Patient;

public class Иглоукалывание implements Лечение{
    @Override
    public void применить(Patient patient) {
        System.out.println("Втыкать иголки на глубину 2 милитра по всему позвоночнику, через полчаса звонить в скорую");
    }
}
