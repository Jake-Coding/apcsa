public class DogClass {
    String name;
    String breed;
    int age;
    int birthday;

    public DogClass(String name ,String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public DogClass(String name, int age) {
        this(name, "Mutt", age);
    }

    public static void bark() {
        System.out.println("Woof!");
    }

    public int getAge() {
        return age;
    }

    public void getOlder() {
        age++;
        System.out.println(name + " turned " + age + " today");
    }
}