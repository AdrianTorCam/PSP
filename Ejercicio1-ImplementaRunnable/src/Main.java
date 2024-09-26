import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Introduce n1:");
        Scanner teclado = new Scanner(System.in);
        int numero1=teclado.nextInt();
        System.out.print("Introduce n2:");
        int numero2=teclado.nextInt();

        Thread t1 = new Thread(new NumerosIntermedios(numero1,numero2));
        t1.start();
    }
}