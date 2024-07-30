package mediator;

public class SimpleMediator implements Mediator{

    private User user1;
    private User user2;

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    @Override
    public void notify(User user, String event) {
        if (user == user1) {
            user2.receive(event);
        } else {
            user1.receive(event);
        }
    }
}
