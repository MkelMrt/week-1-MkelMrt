public class PhysicalKey implements Key {

    int id;

    PhysicalKey(int id) {
        this.id = id;
    }

    @Override
    public boolean unlockLock(Lock l) {
        if (l.id == this.id) {
            l.locked = false;
        }

        return true;
    }

    @Override
    public int getid() {
        return id;
    }

}
