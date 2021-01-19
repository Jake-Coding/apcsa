public class Cat extends Animal{

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    public String makeNoise() {
        return "Meow!";
    }

    public boolean isHappy() {
        return hasEaten() && hasSlept() && hasPlayed();
    }


    
}