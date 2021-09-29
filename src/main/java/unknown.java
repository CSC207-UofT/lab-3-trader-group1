public class unknown implements Domesticatable, Tradable {
    private final int maxSpeed;

    public unknown() {
        this.maxSpeed = 10000;
    }

    @Override
    public String sound() {
        return "dont know!";
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
