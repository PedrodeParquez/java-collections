package org.example;

public class Human implements Comparable<Human>{
    private final String firstName;
    private final String lastName;
    private final int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human other) {
        int result = this.firstName.compareTo(other.firstName);
        System.out.println("Comparing firstName: " + this.firstName + " with " + other.firstName + " = " + result);


        if (result == 0) {
            result = this.lastName.compareTo(other.lastName);
            System.out.println("Comparing lastName: " + this.lastName + " with " + other.lastName + " = " + result);

            if (result == 0) {
                result = Integer.compare(this.age, other.age);
                System.out.println("Comparing age: " + this.age + " with " + other.age + " = " + result);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Human{firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + "}";
    }
}
