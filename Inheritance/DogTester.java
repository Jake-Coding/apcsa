public class DogTester {
    public static void main(String[] args) {
        Dog testingDog = new Dog("Steve", "Pug", 13);
        System.out.println(testingDog); // not happy
        testingDog.eat();
        System.out.println(testingDog); // happy
        testingDog.reset();
        System.out.println(testingDog.getAge()); // 13
        System.out.println(testingDog); // not happy
        testingDog.play();
        System.out.println(testingDog.makeNoise());
        System.out.println(testingDog); // is happy :)
    }
}