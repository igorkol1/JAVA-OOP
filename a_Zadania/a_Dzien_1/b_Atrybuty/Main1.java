package a_Zadania.a_Dzien_1.b_Atrybuty;

public class Main1 {

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        boolean testAttribute = accessModifier.protectedAttribute; // opcjonelnie boolean testAttribute = accessModifier.publicAttribute
        System.out.println(testAttribute);
    }
}
