public abstract class Animal{
    private String name;
    private String breed;
    private int age;
    private boolean eaten, played, slept = false;

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {return name;}
    public String getBreed() {return breed;}
    public int getAge() {return age;}

    public boolean hasEaten() {return eaten;}
    public boolean hasSlept() {return slept;}
    public boolean hasPlayed() {return played;}

    public void eat() {eaten = true;}
    public void sleep() {slept = true;}
    public void play() {played = true;}
    public void reset() {eaten = false; played = false; slept = false;}

    public abstract String makeNoise();

    public abstract boolean isHappy();

    public String toString() {
        return name + " : " + breed + " : " + age + " ishappy? " + isHappy();
    }


    
}