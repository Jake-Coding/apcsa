public class Pony extends Animal {
    private boolean groomed = false;

    public Pony(String name, String breed, int age) {
        super(name, breed, age);
    }

    public String makeNoise() {
        return "Woof!";
    }

    public void groom() {groomed = true;}
    public boolean isGroomed() {return groomed;}

    public boolean isHappy() {
        return hasEaten() && hasSlept() && hasPlayed() && isGroomed();
    }


    
}