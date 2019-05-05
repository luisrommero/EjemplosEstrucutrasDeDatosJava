/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import clases.Utilities;
import java.util.ArrayList;
import java.util.Collections;
//--
import clases.Persona;

/**
 *
 * @author luisromero
 */
public class EjemploArrayList
{
    public void Ejecutar()
    {
        //Ejemplo 1: Cargar un ArrayList con tipos de datos primitivos (int, double, float, bool, string, etc.)
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
        
        //Ejemplo 2: Crear un array list de objetos a partir de clases desarrolladas por uno mismo.
        
        ArrayList<Persona> ListaDePersonas = new ArrayList<Persona>();
        
        //Crear objeto persona 01
        Persona Persona01 = new Persona();
        Persona01.Nombre = "Max";
        Persona01.Apellido = "Vázquez";
        Persona01.Edad = 20.0;
        
        //Crear objeto persona 02
        Persona Persona02 = new Persona();
        Persona02.Nombre = "Sergio";
        Persona02.Apellido = "Pardo";
        Persona02.Edad = 29.0;
        
        //Crear objeto persona 03
        Persona Persona03 = new Persona();
        Persona03.Nombre = "Lewis";
        Persona03.Apellido = "Herández";
        Persona03.Edad = 33.0;
        
        //Crear objeto persona 04
        Persona Persona04 = new Persona();
        Persona04.Nombre = "Valteri";
        Persona04.Apellido = "Bocanegra";
        Persona04.Edad = 30.5;
        
        //Agregar todas las personas a la lista
        ListaDePersonas.add(Persona04); //Guardado en la posición 0
        ListaDePersonas.add(Persona02); //Guardado en la posición 1
        ListaDePersonas.add(Persona03); //Guardado en la posición 2
        ListaDePersonas.add(Persona01); //Guardado en la posición 3
        
        System.out.println(ListaDePersonas.get(2).Nombre); //Imprimir el nombre de la persona guardada en la posición 2
        
        //Obtener el objeto de tipo "Persona" guardado en la posición 1, guardarlo en un nuevo objeto e imprimir el apellido de esa persona
        
        Persona PersonaGuardada = ListaDePersonas.get(1);
        System.out.println(PersonaGuardada.Apellido);
        
    }
}
