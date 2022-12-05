
public abstract class KeyDecorator {
    Key key;

    public KeyDecorator(Key k) {
        this.key = k;
    }

    public boolean unlockLock(Lock l) {
        if (l.id == key.getid()) {
            l.locked = false;
        }

        return true;
    }

}