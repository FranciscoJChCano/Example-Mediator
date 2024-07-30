package mediator;

public class ConcreteUser extends User{

    private String name;

    public ConcreteUser(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " envía: " + message);
        mediator.notify(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " recibe: " + message);
    }
}
