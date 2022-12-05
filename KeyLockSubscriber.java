public class KeyLockSubscriber extends Subscriber {

    int keyLocksAdded;

    public KeyLockSubscriber() {
        this.keyLocksAdded = 0;
    }

    @Override
    public void update() {
        keyLocksAdded++;
    }

}
