public class Pot implements Tradable, Drivable {
    private int maxSpeed;

    public Pot() {
        this.maxSpeed = 50;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 50;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
