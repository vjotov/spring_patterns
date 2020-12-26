package lazy_singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Lazy
public class Blaster {
    @PostConstruct
    private void init() {
        System.out.println("you payd 100500 for blaster");
    }

    public void fire() {
        System.out.println("boom boom!!!");
    }
}
