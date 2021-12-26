/**
 * Java 1. Homework 6
 * <p>
 * stuent: Anna Ostrovskaya
 * version 1: 25.12.2021
 */

interface IAnimal {
    String run(int distance);

    String swim(int distance);
}

abstract class Animal implements IAnimal {

    protected String name;

    protected int MAX_RUN_DISTANCE;
    protected int MAX_SWIM_DISTANCE;

    abstract public String run(int distance);

    abstract public String swim(int distance);

    public Animal(String name) {
        this.name = name;
    }

}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.MAX_RUN_DISTANCE = 200;
        this.MAX_SWIM_DISTANCE = 0;
    }

    @Override
    public String run(int distance) {
        if (distance <= this.MAX_RUN_DISTANCE) {
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
        this.MAX_RUN_DISTANCE = 500;
        this.MAX_SWIM_DISTANCE = 10;
    }

    @Override
    public String run(int distance) {
        if (distance <= this.MAX_RUN_DISTANCE) {
            return this.name + " ran " + Integer.toString(distance) + " meters";
        } else {
            return this.name + " CAN NOT run " + Integer.toString(distance) + " meters";
        }
    }

    @Override
    public String swim(int distance) {
        if (distance <= this.MAX_SWIM_DISTANCE) {
            return this.name + " swam " + Integer.toString(distance) + " meters";
        } else {
            return this.name + " CAN NOT swim " + Integer.toString(distance) + " meters";
        }
    }
}


public class lesson6practice_1 {

    public static void main(String[] args) {

        IAnimal cat = new Cat("Moorzik");
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




