import java.util.HashMap;

public class KeyLockStore extends Publisher {

    HashMap<Key, Lock> pairs;

    public KeyLockStore() {
        pairs = new HashMap<>();
    }

    public void addKeyLockPair(Key k, Lock l) {
        this.pairs.put(k, l);
        updateSubscribers();
    }

    @Override
    public void updateSubscribers() {
        for (Subscriber s : subs) {
            s.update();
        }

    }

}
