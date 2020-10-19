# Classes

Multiple functions and variables that describe an object  

## Classes in Java

`public class className`  
Example time!  

```java
public class Car {
    // data/variables
    String make;
    String model;
    int year;
    double speed;
    int gear;
    boolean isAutomatic;

    // abilities/methods
    public void drive() {
        speed += 10;
        if (speed.....) {// its an example, don't judge me
            gear = 1;
        } else {
            gear = 2; // etc.
        }
    }

    public String getMake() { // getter
        return make;
    }

    public void setMake(String make) { // setter
        this.make = make;
    }

    public Car(String make) { // Constructor
        this.make = make;
    }

    public Car() { // Overloading constructors
        this("Honda"); // this keyword as a function -> calls self (overloaded shenanigans)
    }
}
```

## This

the `this` keyword.

```java
public void setMake(String make) {
    this.make = make; // so we don't confuse this.make and the input make. NOTE: JAVA practices say don't do setVal(type differentName). Best practice: setVal(type val). setMake(String newmake) {make = newMake} would also work but its not best java
}
```
