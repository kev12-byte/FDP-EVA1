/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad = input.nextInt ();
        if(edad >= 18){
            System.out.println("Puedes compar alcohol");   
        }else{
            System.out.println("No puedes comprar alcohol!!");
        }
    }
    
}
      