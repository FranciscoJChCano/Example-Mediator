package mediator;

public abstract class User {
    protected Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {

    }

    public void receive(String message) {

    }
}
