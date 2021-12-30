/**
 * Java 1. Homework 6
 * <p>
 * stuent: Anna Ostrovskaya
 * version 1: 27.12.2021
 */

class lesson7 {
    public static void main(String[] args) {

        Duck [] ducks = new Duck[3];
        ducks[0] = new Duck("Cracker", 10, false);
        ducks[1] = new Duck("Yellow", 15, false);
        ducks[2] = new Duck("Feather", 7, false);

        Plate plate = new Plate(20);
        for (int i = 0; i < ducks.length; i++) {
            if (ducks[i].full == false && ducks[i].appetite <= plate.food) {
                ducks[i].eat(plate);
                ducks[i].full = true;

                System.out.println ("Duck " + ducks[i].name + " has eaten!");

            } else {

                System.out.println ("Duck " + ducks[i].name + " is still hungry!");
            }
        }


        System.out.println("Food still left on the plate: " + Integer.toString(plate.remainingFood()));
    }
}

class Duck {
    String name;
    int appetite;
    boolean full;

    Duck(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(this.appetite);
    }

    @Override
    public String toString() {
        return name + ", appetite: " + appetite;
    }
}

class Plate {
    int food;

    Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    public int remainingFood() {
        return this.food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}

