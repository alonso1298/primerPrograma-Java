import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroGenerado = new Random().nextInt(100);
        int intentos = 5;
        int intentosUsuario = 0;
        int numeroUsuario;

        while (intentosUsuario < intentos) {
            intentosUsuario++;
            System.out.println("Tienes 5 intentos, ingresa un número");
            numeroUsuario = teclado.nextInt();

            if(numeroUsuario > numeroGenerado) {
                System.out.println("El numero es menor");
            }
            if(numeroUsuario < numeroGenerado){
                System.out.println("El numero es mayor");
            }
            if (numeroUsuario == numeroGenerado){
                System.out.println("Felicidades adivinaste el número");
                break;
            }
            if (intentosUsuario == intentos) {
                System.out.println("😢 Se acabaron los intentos. El número era: " + numeroGenerado);
            }
            System.out.printf("Intentos: %d%n", intentosUsuario);
        }
    }
}
