public class Fish implements Tradable, Domesticatable, Drivable {
    private int getMaxSpeed;
    public Fish(){
        this.getMaxSpeed = 60;
    }

    @Override
    public String sound() {
        return "null";
    }

    @Override
    public int getPrice() {
        return 50;
    }


    @Override
    public void upgradeSpeed() {

    }

    @Override
    public void downgradeSpeed() {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }
}
