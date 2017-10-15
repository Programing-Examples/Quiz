/*
* Simple  questions quiz
* Questions will be repeated if they are
* answered incorrectly
* */

package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char answer;
        Scanner scanner = new Scanner(System.in);

	    do {
            System.out.println("¿Cuál es la capital de Italia? ");
            System.out.println("a- Madrid \t\t b- Lisboa");
            System.out.println("c- Roma \t\t d- Moscú");

            answer = scanner.next().charAt(0);
        }while (answer != 'c');

        do {
            System.out.println("¿Cuántos dias tiene Enero? ");
            System.out.println("a- 30 \t\t b- 31");
            System.out.println("c- 28 \t\t d- 29");

            answer = scanner.next().charAt(0);
        }while (answer != 'b');

        do {
            System.out.println("¿Cuál es el cuarto planeta del Sistema Solar? ");
            System.out.println("a- Mercurio \t\t b- Marte");
            System.out.println("c- Venus \t\t\t d- Saturno");

            answer = scanner.next().charAt(0);
        }while (answer != 'b');

        do {
            System.out.println("¿Cuántas patas tiene un insecto? ");
            System.out.println("a- 6 \t\t b- 4");
            System.out.println("c- 12 \t\t d- 8");

            answer = scanner.next().charAt(0);
        }while (answer != 'a');

        System.out.println("\nFelicidades!!!");

    }
}
