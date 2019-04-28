package a_Zadania.a_Dzien_1.b_Atrybuty;

public class Person {

    //There is no need to make fields public
    private String name;
    private String surname;
    private int age;
    private char gender ;

    public Person(){
         name = "Empty name";
         surname  = "Empty surname";
         age = 0;
         gender ='m';
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
