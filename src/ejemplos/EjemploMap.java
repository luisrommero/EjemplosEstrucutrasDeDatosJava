/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import clases.Perro;
import clases.Persona;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author luisromero
 */
public class EjemploMap
{

    public void Ejecutar()
    {
        Map<String, List<Perro>> Mapa = new HashMap<String, List<Perro>>(); // Permite asociar un nombre a una lista de perros
        
        Perro Perro01 = new Perro();
        Perro01.Nombre = "Nico";
        Perro01.Raza = "Boxer";
        Perro01.Edad = 1.5;
        
        Perro Perro02 = new Perro();
        Perro02.Nombre = "Linus";
        Perro02.Raza = "Pastor Australiano";
        Perro02.Edad = 1.2;
        
        Perro Perro03 = new Perro();
        Perro03.Nombre = "Rilay";
        Perro03.Raza = "Pitbull";
        Perro03.Edad = 1.1;
        
        Perro Perro04 = new Perro();
        Perro04.Nombre = "Akasha";
        Perro04.Raza = "Boxer";
        Perro04.Edad = 1.5;
        
        Perro Perro05 = new Perro();
        Perro05.Nombre = "Jack";
        Perro05.Raza = "Labrador";
        Perro05.Edad = 10.7;
        
        Mapa.put("Luis", Arrays.asList(Perro01, Perro02)); //Asociar los perros 01 y 02 a Luis
        Mapa.put("Paulina", Arrays.asList(Perro03, Perro04)); //Asociar los perros 03 y 04 a Paulina
        Mapa.put("Carlos", Arrays.asList(Perro05)); //Asociar el perro 05 a Carlos
        
        List<Perro> ListaDePerrosDeLuis = Mapa.get("Luis"); //Obtener los perros asociados a Luis
        for (int i = 0; i < ListaDePerrosDeLuis.size(); i++) //Imprimir la lista de perros de Luis
        {
            Perro Perro = ListaDePerrosDeLuis.get(i);
            System.out.println(">Perro "+ (i+1) +" de Luis: " + Perro.Nombre + "("+Perro.Raza+")");
        }
        
        List<Perro> ListaDePerrosDeCarlos = Mapa.get("Carlos"); //Obtener los perros asociados a Carlos
        for (int i = 0; i < ListaDePerrosDeCarlos.size(); i++) //Imprimir la lista de perros de Carlos
        {
            Perro Perro = ListaDePerrosDeCarlos.get(i);
            System.out.println(">Perro "+ (i+1) +" de Carlos: " + Perro.Nombre + "("+Perro.Raza+")");
        }
        
        if(Mapa.containsKey("Hugo")) //Verifica si se ha registrado un Hugo e intenta obtener la lista de perros.
        {
            List<Perro> ListaDePerrosDeHugo = Mapa.get("Hugo"); //Obtener los perros asociados a Hugo
            for (int i = 0; i < ListaDePerrosDeHugo.size(); i++) //Imprimir la lista de perros de Hugo
            {
                Perro Perro = ListaDePerrosDeHugo.get(i);
                System.out.println(">Perro "+ (i+1) +" de Hugo: " + Perro.Nombre + "("+Perro.Raza+")");
            }
        }
        else System.out.println("Ningún Hugo ha sido registrado en el Map.");
        
    }
    
}
