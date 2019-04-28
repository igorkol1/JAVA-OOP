package a_Zadania.a_Dzien_1.c_Metody;

import java.util.StringJoiner;

public class Person {

    private String name;
    private String surname;
    private int age;
    private char gender;

    public Person() {
        name = "Empty name";
        surname = "Empty surname";
        age = 0;
        gender = 'm';
    }

    //W klasie Person napisz metodę increaseAge, która inkrementuje zmienną age o 1.

    public void increaseAge(){
        age++;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
