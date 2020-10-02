package pilas1.pkg3;

import java.util.Scanner;
import java.util.Random;


public class PILAS13 {

    public static void main(String[] args) {
        Scanner AB = new Scanner(System.in);
        int opc, pilas = 0, pilas1 = 0;
        int tamano;
        System.out.println("Ingresa una numer para la pila: ");
        tamano = AB.nextInt();
        int a[] = new int[tamano];
        int b[] = new int[tamano];
        int c[] = new int[tamano];
        do {
            System.out.println(" MENU"
                    + "\t \n1.-mostrar las pilas A y B"
                    + "\t \n 2.-llena las pilas A y B"
                    + "\t\n  3.-unir pilas"
                    + "\t\n  4.-vacir las pilas"
                    + "\t \n 5.-ver la pila c"
                    + "\t\n  6.-salir");
            switch (opc = AB.nextInt()) {
                case 1:
                    System.out.println("Pila a: ");
                    for (int i = 0; i < tamano; i++) {
                        System.out.println(a[i] + " ");
                    }
                    System.out.println("pila b: ");
                    for (int j = 0; j < tamano; j++) {
                        System.out.println(b[j] + " ");
                        pilas++;
                    }
                    for (int k = 0; k < tamano; k++) {
                        b[k] = (int) (Math.random() * 200 - 100 + 100);
                        pilas++;
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    for (int i = 0; i < tamano; i++) {
                        a[i] = (int) (Math.random()* 100 + 1);

                    }
                    break;
                case 3:
                    for (int p = 0; p < tamano; p++) {
                        c[p] = a[p] + b[p];
                    }
                    break;
                case 4:
                    if (pilas > 0 && pilas > 0) {
                        for (int i = 0; i < tamano; i++) {
                            pilas--;
                        }
                        for (int j = 0; j < tamano; j++) {
                            pilas1--;
                        }
                        System.out.println("no hay nada en las pilas A y B");
                    } else {
                        System.out.println("solo vacia una pila");
                    }
                    break;
                case 5:
                    for (int h = 0; h < tamano; h++) {
                        System.out.println(c[h] + "");
                    }
                    break;
                case 6:
                    System.out.println(":3");
                    break;
                default:
                    System.out.println(" la opcion que diste no es la correcta");
            }

        } while (opc != 6);
    }
}
