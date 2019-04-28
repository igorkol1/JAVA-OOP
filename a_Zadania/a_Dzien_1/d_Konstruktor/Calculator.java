package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.ArrayList;
import java.util.List;

//Następnie dodaj do klasy następujące metody:
//
//        add(num1, num2) – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "added num1 to num2 got result".
//        multiply(num1, num2) – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "multiplied num1 with num2 got result".
//        subtract(num1, num2) – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "subtracted num1 from num2 got result".
//        divide(num1, num2) – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "divided num1 by num2 got result". Pamiętaj, że nie można dzielić przez zero.
//        printOperations() – metoda ma wypisać wszystkie zapamiętane operacje.
//        clearOperations() – metoda ma wyczyścić wszystkie zapamiętane operacje.
//        Możesz dopisać metodę pomocniczą, która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowanie.
//
//        Pamiętaj o używaniu this w odpowiednich miejscach. Stwórz kilka kalkulatorów i przetestuj ich działanie.


public class Calculator {

    List<String> history;

    public Calculator() {
        this.history = new ArrayList<>();
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        this.history.add("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        this.history.add("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        this.history.add("subtracted " + num1 + " from " + num2 + " got " + result);
        return result;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        int result = num1 / num2;
        this.history.add("divided " + num1 + " by " + num2 + " got " + result);
        return result;
    }

    public void printOperations(){
        this.history.forEach(System.out::println);
    }

    public void clearOperations(){
        this.history = new ArrayList<>();
    }



}
