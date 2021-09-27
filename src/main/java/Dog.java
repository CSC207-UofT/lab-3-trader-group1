public class Dog implements Domesticatable, Tradable{
    public String breed;
    public int age;
    public Dog (String b, int a){
        this.breed = b;
        this.a = a;
    }
    @Override
    public String sound(){
        return "Bark";
    }

    @Override
    public int Price() {
        return 15;
    }
}