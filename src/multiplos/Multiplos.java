/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

import java.util.Scanner;

/**
 *
 * @author Sandro
 */
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe su primer numero");
        int numeror = sc.nextInt();
        System.out.println("Escribe su segundo numero");
        int numeroi = sc.nextInt();
        
        
        Numero numero1 = new Numero(numeror,numeroi);
        System.out.println("   Primer Numero     ");
        System.out.println("El Numero que inserto es: "+numero1.getnumeroa());
         System.out.println("   Segundo Numero    ");
        System.out.println("El Numero que inserto es: "+numero1.getnumerob());
         System.out.println("Mensaje : "+numero1.MostrarResulados2 ());
        
    }
    
}
