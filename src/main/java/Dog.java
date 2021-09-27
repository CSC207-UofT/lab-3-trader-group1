/* A sample class that implements the given interfaces.
 */
public class Dog implements Domesticatable, Tradable {
    private int maxSpeed;

    public Dogs() {
        this.maxSpeed = 1;
    }

    public String sound() {
        return "Woof Woof!";
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
