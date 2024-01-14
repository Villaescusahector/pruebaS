/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AceptaElReto;

import java.util.Scanner;

public class E217LadoCalle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l;

        do {
            l = Integer.parseInt(sc.nextLine());
            if (l % 2 == 0 && l != 0) {
                System.out.println("DERECHA");
            } else if (l % 2 != 0) {
                System.out.println("IZQUIERDA");
            }

        } while (l != 0);

    }

}
