/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

public class Ejercicio21 {


    public static void main(String[] args) {
        double x,y,z,h,p,w;
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese la longitud del primer lado: ");
        x = entrada.nextDouble();
        
        System.out.print("Ingrese la longitud del segundo lado: ");
        y = entrada.nextDouble();
        
        System.out.print("Ingrese la longitud del tercer lado: ");
        z = entrada.nextDouble();

        h = x + y + z;

        p = h / 2;

        w= Math.sqrt(p * (p- x) * (p - y) * (p - z));

        System.out.println("Perímetro: " + h);
        System.out.println("Semiperímetro: " + p);
        System.out.println("Área: " + w);
    }
}