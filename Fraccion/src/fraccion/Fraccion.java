/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccion;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Fraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones miOperacion = new Operaciones();
        int numerador,denominador;
        int caso;
        int num,resultado=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numerador: ");
        miOperacion.setNumerador(sc.nextInt());
        System.out.println("Escriba el denominador: ");
        miOperacion.setDenominador(sc.nextInt());
        miOperacion.toString();
        System.out.println("¿Que operacion desea realizar?"
                + "\n 1.Invertir la fraccion"
                + "\n 2.Multiplicar"
                + "\n 3.Dividir la fraccion"
                + "\n 4.Dividir la fraccion entre un numero");
        caso=sc.nextInt();
        //Switch para indicar que funcion debe realizar el programa
        switch(caso){
            case 1:
                
                miOperacion.invertir();
                
                break;
            case 2: 
                System.out.println("Escriba el numero que desea multiplicar a la fraccion: ");
                miOperacion.setNum(sc.nextInt());
                miOperacion.Multiplicacion();
                
        break;
            case 3:
                miOperacion.DivisionFracion();
                
       break;
            case 4:
                System.out.println("Escriba el numero que desea dividir a la fraccion: ");
                miOperacion.setNum(sc.nextInt());
                miOperacion.Division();
                 
        break;
            default:
                System.out.println("ERROR");
        }
        
        
        
    }
    
}
