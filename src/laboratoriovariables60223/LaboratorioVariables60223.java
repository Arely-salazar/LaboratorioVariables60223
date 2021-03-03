/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriovariables60223;
import java.util.Scanner;
/**
 *
 * @author Jairo
 */
public class LaboratorioVariables60223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primera parte : Declaración de variables primitivas
        boolean booleano;
        char caracter; 
        byte numeroMuyPequeño;
        short numeroPequeño;
        int entero;
        long largo;
        float flotante;
        double doble;
        
        //segunda parte: Diferencias entre los tipos de datos primitivos
        entero = 97;
        doble = 97;
        caracter = 97;
        
        System.out.println("El valor 97 como entero es: " + entero);
        System.out.println("El valor como doble es: " + doble);
        System.out.println("El valor como caracter es: " + caracter);   
        
        //tercera parte: Variables de referencia
        
        String cadena = new String("Variables de Referencia!");
        Scanner lector = new Scanner(System.in);
        
        System.out.println("¡Los Strings en Java son " + cadena);
        System.out.println("");
        
        //cuarta parte : Literales
        
        booleano = true;
        caracter = '7';
        System.out.println(booleano);
        System.out.println(caracter);
        System.out.println("");
        
        booleano = false;
        caracter = '\u0037';
        System.out.println(booleano);
        System.out.println(caracter);
        System.out.println("");
        
        caracter = '\n';
        System.out.println("El caracter salto de línea en acción: ");
        System.out.println(caracter);
        flotante = 3.14159265f;
        System.out.println(flotante);
        cadena = "¡Puedes asignar valores a un String con literales!";
        System.out.println(cadena);
        System.out.println(caracter);
        
        //quinta parte:  Lectura de datos del usuario
        System.out.println("¿Cómo te llamas: ");
        String nombre = lector.nextLine();
        System.out.println("¿Cuántos años tienes?: ");
        int edad = lector.nextInt();
        System.out.println(" ¡Te llamas " + nombre + " y tienes "+ edad + "años");
               
                
  
                
 
              
        
        
                
        
    }
    
}
