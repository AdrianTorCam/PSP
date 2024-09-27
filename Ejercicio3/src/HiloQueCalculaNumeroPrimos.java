import java.util.Random;

public class HiloQueCalculaNumeroPrimos implements Runnable {

    int numeroHilo;

    public HiloQueCalculaNumeroPrimos(int numeroHilo) {
        this.numeroHilo = numeroHilo;
    }

    @Override
    public void run() {
        Random seed = new Random();
        int numeroAleatorio = seed.nextInt(1,101);
        System.out.println("Hilo "+ numeroHilo+":"+" Mostrando primos hasta el "+ numeroAleatorio);
        for (int i = 2; i <= numeroAleatorio; i++) {
            if (esPrimo(i)) {
                try {
                    Thread.sleep(seed.nextInt(100,1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hilo "+ numeroHilo+": "+i);
            }
        }
    }
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
