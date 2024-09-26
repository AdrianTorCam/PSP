import java.util.Random;

public class NumerosIntermedios implements Runnable{

    public int numero1;
    private int numero2;

    public NumerosIntermedios(int numero1,int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public void run() {
        System.out.println("El hilo se ha lanzado que implementa runnable");

        int valor = 0;
        if (numero1 >= numero2) {
            valor = numero2;
            while (numero1 > valor) {
                Random seed = new Random();
                long tiempoAleatorio = seed.nextLong(1, 1000);
                try {
                    Thread.sleep(tiempoAleatorio);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (valor != numero2) {
                    System.out.println(valor);
                }
                valor++;
            }

        } else {
            valor = numero1;
            while (numero2 > valor) {
                Random seed = new Random();
                long tiempoAleatorio = seed.nextLong(1, 1000);
                try {
                    Thread.sleep(tiempoAleatorio);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (valor != numero1) {
                    System.out.println(valor);
                }
                valor++;
            }
        }
    }
}

