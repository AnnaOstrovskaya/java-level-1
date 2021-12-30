/**
 * Java 1. Homework 6
 * <p>
 * stuent: Anna Ostrovskaya
 * version 1: 25.12.2021
 * version 2: 30.12.2021
 */

interface IAnimal {
    String run(int distance);

    String swim(int distance);
}

abstract class Animal implements IAnimal {

    protected String name;

    protected int max_run_distance;
    protected int max_swim_distance;

    abstract public String run(int distance);

    abstract public String swim(int distance);

    public Animal(String name) {
        this.name = name;
    }

}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.max_run_distance = 200;
        this.max_swim_distance = 0;
    }

    @Override
    public String run(int distance) {
        if (distance <= this.max_run_distance) {
            return this.name + " ran " + Integer.toString(distance) + " meters";
        } else {
            return this.name + " CAN NOT run " + Integer.toString(distance) + " meters";
        }
    }

    @Override
    public String swim(int distance) {
        return this.name + " is a cat. Cat's can't swim!";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.max_run_distance = 500;
        this.max_swim_distance = 10;
    }

    @Override
    public String run(int distance) {
        if (distance <= this.max_run_distance) {
            return this.name + " ran " + Integer.toString(distance) + " meters";
        } else {
            return this.name + " CAN NOT run " + Integer.toString(distance) + " meters";
        }
    }

    @Override
    public String swim(int distance) {
        if (distance <= this.max_swim_distance) {
            return this.name + " swam " + Integer.toString(distance) + " meters";
        } else {
            return this.name + " CAN NOT swim " + Integer.toString(distance) + " meters";
        }
    }
}


public class lesson6practice_1 {

    public static void main(String[] args) {

        // my way
        IAnimal cat = new Cat("Moorzik");

        //proposed way
        //IAnimal cat = new Cat("Muhtar", max_swim_distance=10, max_run_distance=500);
        //IAnimal dog = new Dog("Moorzik", max_swim_distance=0, max_run_distance=100);

        // drawbacks:
        // 1. we are opening the doors to consumers of our class creating cat-like dogs and dog-like cats,
        // making the class name (definition) meaningless and confusing
        // 2. Have to define values in constructor each time (unless we specify default values)

        System.out.println(cat.run(10));
        System.out.println(cat.run(1000));
        System.out.println(cat.swim(1));

        IAnimal dog = new Dog("Bobik");
        System.out.println(dog.run(10));
        System.out.println(dog.run(100));
        System.out.println(dog.run(1000));
        System.out.println(dog.swim(1));
        System.out.println(dog.swim(1000));


        System.out.println();
    }


}




