package corona.services;

import corona.model.Papaya;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSRService {
    private List<?> answer = List.of("true", "false", new Papaya());
    private int position;

    public boolean isPositive() {
        if(position == answer.size()){
            position = 0;
        }
        System.out.println(position);
        String s = (String) answer.get(position++);
        System.out.println(s);
        return Boolean.parseBoolean(s);
    }
}
