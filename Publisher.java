import java.util.ArrayList;

public abstract class Publisher {

    ArrayList<Subscriber> subs;

    public Publisher() {
        subs = new ArrayList<Subscriber>();
    }

    public void addSubscriber(Subscriber sub) {
        this.subs.add(sub);
    }

    public void removeSubscriber(Subscriber sub) {
        this.subs.remove(sub);
    }

    public abstract void updateSubscribers();

}
