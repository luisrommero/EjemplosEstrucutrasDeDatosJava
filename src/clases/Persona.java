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
public class Persona
{
    public String Nombre;
    public String Apellido;
    public Double Edad;
    
    
    public void Saludar()
    {
        System.out.println("HOLA, mi nombre es "+ this.Nombre +" " + this.Apellido + ". Soy una persona de "+ this.Edad +" años.");
    }
    
    
    public void Brincar()
    {
        System.out.println("Mi nombre es "+ this.Nombre +" " + this.Apellido + ". Soy una persona de "+ this.Edad +" años y estoy BRINCANDO.");
    }
    
}
