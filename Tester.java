import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tester {

    @Test
    public void testPubSub() {
        KeyLockStore kls = new KeyLockStore();
        KeyLockSubscriber klSub = new KeyLockSubscriber();
        kls.addSubscriber(klSub);

        assertTrue(klSub.keyLocksAdded == 0);

        Key key = new PhysicalKey(0);
        Lock lock = new Lock(0);
        kls.addKeyLockPair(key, lock);

        assertTrue(klSub.keyLocksAdded == 1);

        Key key2 = new PhysicalKey(1);
        Lock lock2 = new Lock(1);
        kls.addKeyLockPair(key2, lock2);

        assertTrue(klSub.keyLocksAdded == 2);
    }

    @Test
    public void testDecorator() {
        Lock l = new Lock(0);

        Key k = new PhysicalKey(0);

        FingerPrintKey fpk = new FingerPrintKey(k);
        fpk.unlockLock(l);
        assertTrue(l.unlockedWith.equals("Fingerprint"));

        l.locked = true;

        CarKey ck = new CarKey(k);
        ck.unlockLock(l);
        assertTrue(l.unlockedWith.equals("CarKey"));
    }
}
