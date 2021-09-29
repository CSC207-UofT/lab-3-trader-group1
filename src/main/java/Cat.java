public class Cat implements Domesticatable, Tradable {
    private final int maxSpeed;

    public Cat() {
        this.maxSpeed = 3;
    }

    @Override
    public String sound() {
        return "Meaw!";
    }

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
