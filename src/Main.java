import mediator.ConcreteUser;
import mediator.SimpleMediator;
import mediator.User;

public class Main {
    public static void main(String[] args) {
        SimpleMediator mediator = new SimpleMediator();

        User user1 = new ConcreteUser(mediator, "María");
        User user2 = new ConcreteUser(mediator, "Diego");

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hola, Diego!");
        user2.send("Hola, María!");
    }
    }
