/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import clases.Persona;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author luisromero
 */
public class EjemploQueue
{
    
    public void Ejecutar()
    {
        Queue<Persona> ColaDeLasTortillas = new LinkedList<>();
        
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
        
        ColaDeLasTortillas.add(Persona01); //Se forma una persona en la cola
        System.out.println(">>Número de personas formadas: " + ColaDeLasTortillas.size());
        ColaDeLasTortillas.add(Persona04); //Se forma otra persona en la cola
        System.out.println(">>Número de personas formadas: " + ColaDeLasTortillas.size());
        ColaDeLasTortillas.add(Persona03); //Se forma otra persona en la cola
        System.out.println(">>Número de personas formadas: " + ColaDeLasTortillas.size());
        this.DespacharTortillas(ColaDeLasTortillas.remove()); //Despachar tortillas a la siguiente persona en la cola
        System.out.println(">>Número de personas formadas: " + ColaDeLasTortillas.size());
        this.DespacharTortillas(ColaDeLasTortillas.remove()); //Despachar tortillas a la siguiente persona en la cola
        System.out.println(">>Número de personas formadas: " + ColaDeLasTortillas.size());
        ColaDeLasTortillas.add(Persona02); //Se forma otra persona en la cola
        System.out.println(">>Número de personas formadas: " + ColaDeLasTortillas.size());
        this.DespacharTortillas(ColaDeLasTortillas.remove()); //Despachar tortillas a la siguiente persona en la cola
        System.out.println(">>Número de personas formadas: " + ColaDeLasTortillas.size());
        this.DespacharTortillas(ColaDeLasTortillas.remove()); //Despachar tortillas a la siguiente persona en la cola
        System.out.println(">>Número de personas formadas: " + ColaDeLasTortillas.size());
        
    }
    
    public void DespacharTortillas(Persona Persona)
    {
        System.out.println(">>Despachando tortillas a: " + Persona.Nombre + " " + Persona.Apellido);
    }
    
}
