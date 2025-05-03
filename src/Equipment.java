import java.util.concurrent.Semaphore;

public class Equipment {
    private final String name;
    final Semaphore quantity;

    public Equipment(String name, int count) {
        this.name = name;
        this.quantity = new Semaphore(count);
    }

    public String getName() {
        return name;
    }

    public boolean acquire() throws InterruptedException {
        quantity.acquire();
        return true;
    }

    public void release() {
        quantity.release();
    }
}
