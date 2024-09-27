import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeroDeHilos=0;
        System.out.print("Introduce el número de hilos a crear: ");
        Scanner sc = new Scanner(System.in);
        numeroDeHilos= sc.nextInt();
        while(numeroDeHilos>0){
            Thread t=new Thread(new HiloQueCalculaNumeroPrimos(numeroDeHilos));
            t.start();
            numeroDeHilos--;
        }

    }
}