package predator_game;

import org.springframework.stereotype.Service;

@Service
public class Dutch extends Commando{
    @Override
    public boolean isAlive() {
        return false;
    }
}
