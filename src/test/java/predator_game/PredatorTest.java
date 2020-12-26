package predator_game;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestEnvConfig.class)
public class PredatorTest {
    @Autowired
    private Billy billy;

    @Autowired
    Predator predator;

    @Test
    public void predatorKillNotDatch() {
        predator.fight(billy);
        Assertions.assertFalse(billy.isAlive());
    }
}
