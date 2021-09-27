
public class Dog implements Tradable, Domesticatable {
    private int maxBarkSound;

    public Dog() {
        this.maxBarkSound = 10;
    }


    @Override
    public int getPrice() {
        return 10;
    }


    public String sound() {
        return "Woof!";
    }

}
