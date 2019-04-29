/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeproyecto;

import clases.*;
import ejemplos.*;
import java.util.Scanner;

/**
 *
 * @author luisromero
 */
public class AQUIEMPIEZAELPROGRAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Boolean Salir = false;
        //--
        while(true)
        {
            Utilities.ClearScreen();
            System.out.println("--- EJEMPLOS DE ESTRUCTURAS DE DATOS ---");
            System.out.println("Selecciona una opción:");
            System.out.println("a) Arrays.");
            System.out.println("b) ArrayList.");
            System.out.println("c) Stack.");
            System.out.println("d) Queue.");
            System.out.println("e) Map.");
            System.out.println("z) Salir.");
            //--
            Scanner reader = new Scanner(System.in);
            String Respuesta = reader.nextLine().toUpperCase();
            //--
            switch(Respuesta)
            {
                case "A": 
                    new EjemploArrays().Ejecutar();
                    break;
                case "B":
                    new EjemploArrayList().Ejecutar();
                    break;
                case "C":
                    new EjemploStack().Ejecutar();
                    break;
                case "D":
                    new EjemploQueue().Ejecutar();
                    break;
                case "E":
                    new EjemploMap().Ejecutar();
                    break;
                case "Z":
                    Salir = true;
                    break;
            }
            //--
            if(Salir) break;
        }
    }
    
}
