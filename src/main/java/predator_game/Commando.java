package predator_game;

public abstract class Commando {
    private boolean alive;
    public Commando() {
        System.out.println(
                getClass().getSimpleName()+
                        " was created"
        );
    }

    public abstract boolean isAlive();
}
