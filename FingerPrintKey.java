public class FingerPrintKey extends KeyDecorator {

    public FingerPrintKey(Key k) {
        super(k);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean unlockLock(Lock l) {
        this.key.unlockLock(l);
        l.unlockedWith = "Fingerprint";
        return true;
    }

}
