/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import clases.Persona;
import clases.Utilities;

/**
 *
 * @author luisromero
 */
public class EjemploArrays
{
    public void Ejecutar()
    {
        //Array de enteros
        int[] Numeros = new int[10]; //Declarar el arreglo
        //Asignar valores uno por uno
        Numeros[0] = 8;
        Numeros[1] = 4;
        Numeros[2] = 1;
        Numeros[3] = 78;
        Numeros[4] = 2;
        Numeros[5] = -1;
        Numeros[6] = 0;
        Numeros[7] = 1;
        Numeros[8] = 3;
        Numeros[9] = 3;
        //Imprimir valor por valor
        System.out.println(Numeros[0]);
        System.out.println(Numeros[1]);
        System.out.println(Numeros[2]);
        System.out.println(Numeros[3]);
        System.out.println(Numeros[4]);
        System.out.println(Numeros[5]);
        System.out.println(Numeros[6]);
        System.out.println(Numeros[7]);
        System.out.println(Numeros[8]);
        System.out.println(Numeros[9]);
        
        //--Array con numeros aleatorios
        int[] NumeroAleatorios = new int[10];
        //Cargar 10 numero aleatorios en cada posicion del array
        for (int i = 0; i < 10; i++)
        {
            NumeroAleatorios[i] = Utilities.ObtenerNumeroAleatorioEntre(0, 50);
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println(NumeroAleatorios[i]);
        }
        
        //Array bidimensional de Personas
        Persona [][] ArrayDePersonas = new Persona[2][2];
        //Crear cada objeto de la clase persona
        Persona Persona01 = new Persona();
        Persona01.Nombre = "Luis";
        Persona01.Apellido = "Romero";
        Persona01.Edad = 30.0;
        //--
        Persona Persona02 = new Persona();
        Persona02.Nombre = "Carlos";
        Persona02.Apellido = "Loyal";
        Persona02.Edad = 29.0;
        //--
        Persona Persona03 = new Persona();
        Persona03.Nombre = "Andoni";
        Persona03.Apellido = "Darino";
        Persona03.Edad = 27.0;
        //--
        Persona Persona04 = new Persona();
        Persona04.Nombre = "Hugo";
        Persona04.Apellido = "Garfias";
        Persona04.Edad = 29.0;
        //--Guardar los objetos persona en el arreglo bidmensional
        ArrayDePersonas[0][0] = Persona01;
        ArrayDePersonas[0][1] = Persona02;
        ArrayDePersonas[1][0] = Persona03;
        ArrayDePersonas[1][1] = Persona04;
        //--Recorrer todo el arreglo bidimensional y obtener los objetos Persona para que "saluden".
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                ArrayDePersonas[i][j].Saludar();
            }
        }
    }
}
