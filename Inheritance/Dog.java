public class Dog extends Animal{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public String makeNoise() {
        return "Woof!";
    }

    public boolean isHappy() {
        return hasEaten() || hasSlept() || hasPlayed();
    }


    
}