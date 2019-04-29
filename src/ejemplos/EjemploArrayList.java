/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import clases.Utilities;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author luisromero
 */
public class EjemploArrayList
{
    public void Ejecutar()
    {
        ArrayList<Integer> ListaDeNumeros = new ArrayList<Integer>(); //Array que crece o decrece dinámicamente
        for (int i = 0; i < 10; i++)
        {
            ListaDeNumeros.add(Utilities.ObtenerNumeroAleatorioEntre(0, 20)); //Agregar 10 primeros números aleatorios
        }
        
        for (int i = 0; i < 10; i++)
        {
            ListaDeNumeros.add(Utilities.ObtenerNumeroAleatorioEntre(0, 20)); //Agregar otros 10 números aleatorios
        }
        
        for (int i = 0; i < ListaDeNumeros.size(); i++) //Imprimir todos los números sin ordenar
        {
            System.out.println(ListaDeNumeros.get(i));
        }
        
        Collections.sort(ListaDeNumeros); //Ordenar de forma ascendente
        
        for (int i = 0; i < ListaDeNumeros.size(); i++) //Imprimir todos los números ya ordenados
        {
            System.out.println(ListaDeNumeros.get(i));
        }
    }
}
