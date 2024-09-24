import java.util.*;
public class java_exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Idade: ");
        int age = sc.nextInt();

        if (age >= 15 && age <= 25) {
            System.out.println(name+": ACEITA");
        }
        else {
            System.out.println(name+": NÃO ACEITA");
        }
    }
}