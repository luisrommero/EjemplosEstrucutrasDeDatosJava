/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author luisromero
 */
public class Perro
{
    public String Nombre;
    public String Raza;
    public Double Edad;
    
    
    public void Correr()
    {
        System.out.println("Mi nombre es "+ this.Nombre +". Soy un perro (" + this.Raza + ") de "+ this.Edad +" años y estoy CORRIENDO.");
    }
    
    
    public void Jugar()
    {
        System.out.println("Mi nombre es "+ this.Nombre +". Soy un perro (" + this.Raza + ") de "+ this.Edad +" años y estoy JUGANDO.");
    }
    
}
