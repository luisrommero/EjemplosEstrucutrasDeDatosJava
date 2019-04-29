/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author luisromero
 */
public class Utilities
{
    public static void ClearScreen()
    {  
        System.out.print("\n\n\n\n");
    }
    
    public static int ObtenerNumeroAleatorioEntre(int low, int high)
    {
        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return(result);
    }
    
}
