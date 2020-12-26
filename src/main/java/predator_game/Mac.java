package predator_game;

import org.springframework.stereotype.Service;

@Service
public class Mac extends Commando{
    @Override
    public boolean isAlive() {
        return false;
    }
}
