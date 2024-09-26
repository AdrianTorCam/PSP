import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.print("Introduce n1:");
            Scanner teclado = new Scanner(System.in);
            int numero1=teclado.nextInt();
            System.out.print("Introduce n2:");
            int numero2=teclado.nextInt();
            System.out.println("El hilo se ha lanzado desde expresion lambda");

            int valor=0;
            if(numero1>=numero2){
                valor= numero2;
                while(numero1>valor){
                    Random seed=new Random();
                    long tiempoAleatorio=seed.nextLong(1,1000);
                    try {
                        Thread.sleep(tiempoAleatorio);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(valor!= numero2){System.out.println(valor);}
                    valor++;
                }

            }else{
                valor= numero1;
                while(numero2>valor){
                    Random seed=new Random();
                    long tiempoAleatorio=seed.nextLong(1,1000);
                    try {
                        Thread.sleep(tiempoAleatorio);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(valor!= numero1){System.out.println(valor);}
                    valor++;
                }
            }

        });

        t.start();
    }
}