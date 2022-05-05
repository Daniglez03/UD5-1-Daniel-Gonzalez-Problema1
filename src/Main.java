import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenerickQueue<Float> colita = new GenerickQueue<Float>();
        boolean entradaUsuario = false;
        while (!entradaUsuario) {
            System.out.println("1.......Introducir valor");
            System.out.println("Q.......Sumar todo y salir");

            System.out.println("Qué deseas hacer?");
            String opcion = sc.nextLine();
            switch (opcion) {
                case"1":
                    System.out.println("Añade un número");
                    float valorIntroducido = sc.nextFloat();
                    colita.enqueue(valorIntroducido);
                    break;
                case"Q":
                    Float suma = 0f;
                    for (int i = 0; i < colita.numObjetos; i++) {
                        suma += colita[i];
                    }
                    System.out.println(suma);
                    System.out.println("Saliendo...");
                    entradaUsuario = true;
                    break;
                default:
                    System.out.println("Introduce una opción correcta...");
            }
        }
    }
}
