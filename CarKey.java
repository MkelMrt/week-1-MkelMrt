public class CarKey extends KeyDecorator {

    public CarKey(Key k) {
        super(k);

    }

    @Override
    public boolean unlockLock(Lock l) {
        this.key.unlockLock(l);
        l.unlockedWith = "CarKey";
        return true;
    }

}
