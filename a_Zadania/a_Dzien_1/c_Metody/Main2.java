package a_Zadania.a_Dzien_1.c_Metody;

public class Main2 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Test Name 1");
        person.setSurname("Test Surname 1");
        person.setAge(99);
        person.setGender('w');
        person.increaseAge();
        System.out.println(person.toString());
        //System.out.println(person.getFullName());
    }
}
