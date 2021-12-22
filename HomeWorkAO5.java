import java.util.Arrays;

/**
 * Java 1. Homework 5
 * <p>
 * stuent: Anna Ostrovskaya
 * version 1: 21.12.2021
 */

public class HomeWorkAO5 {

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5]; {

            empArray[0] = new Employee("Anna", "Ostrovskaya", "AdminAssistant",
                    "aalukyanova@gmail.com", 07572547456L, 30000, 31);
            empArray[1] = new Employee ("Daniel", "Watts", "Broadcast_engineer",
                    "danielwatts@gmail.com", 07572547456L, 80000, 31);
            empArray[2] = new Employee ("Sarah", "Newton", "Accounant",
                    "sarahnewton@gmail.com", 07572547456L, 50, 46);
            empArray[3] = new Employee ("Ethan", "Hunt", "Agent",
                    "johnwick@gmail.com", 07572547456L, 200000, 40);
            empArray[4] = new Employee ("Boris", "Johnson", "Production_Manager",
                    "borisjohnson@gmail.com", 07572547456L, 100000, 51);

            for (Employee employee : empArray) {
                if (employee.getAge() > 40) {
                    System.out.println(employee);
                }
            }

            System.out.println();

            for (Employee employee : empArray) {
                System.out.println(employee);
            }
        }
        System.out.println();
    }
}

class Employee {
    private String firstname;
    private String surname;
    private String position;
    private String email;
    private long phonenumber;
    private int annualsalary;
    private int age;

    Employee(String firstname, String surname, String position, String email, long phonenumber, int annualsalary, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.annualsalary = annualsalary;
        this.age = age;
    }

    public String toString() {
        return firstname + " " + surname + "," + position + "," + email + "," + phonenumber + "," + annualsalary + "," + age;
    }

    public int getAge() {
        return age;
    }
}