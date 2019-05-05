/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import clases.Libro;
import java.util.Stack;

/**
 *
 * @author luisromero
 */
public class EjemploStack
{
    public void Ejecutar()
    {
        Stack<Libro> PilaDeLibros = new Stack<Libro>();
        
        Libro Libro01 = new Libro();
        Libro01.Nombre = "El Viejo y El Mar";
        Libro01.Autor = "Ernest Hemingway";
        
        Libro Libro02 = new Libro();
        Libro02.Nombre = "Rayuela";
        Libro02.Autor = "Julio Cortázar";
        
        Libro Libro03 = new Libro();
        Libro03.Nombre = "1984";
        Libro03.Autor = "George Orwell";
        
        Libro Libro04 = new Libro();
        Libro04.Nombre = "La Divina Comedia";
        Libro04.Autor = "Dante Alighieri";
        
        PilaDeLibros.push(Libro04); //Apilar un libro
        System.out.println(">>Número de libros apilados: " + PilaDeLibros.size());
        PilaDeLibros.push(Libro01); //Apilar otro libro
        System.out.println(">>Número de libros apilados: " + PilaDeLibros.size());
        PilaDeLibros.push(Libro02); //Apilar otro libro
        System.out.println(">>Número de libros apilados: " + PilaDeLibros.size());
        PilaDeLibros.push(Libro03); //Apilar otro libro
        System.out.println(">>Número de libros apilados: " + PilaDeLibros.size());
        this.LeerLibro(PilaDeLibros.pop());
        System.out.println(">>Número de libros apilados: " + PilaDeLibros.size());
        this.LeerLibro(PilaDeLibros.pop());
        System.out.println(">>Número de libros apilados: " + PilaDeLibros.size());
        this.LeerLibro(PilaDeLibros.pop());
        System.out.println(">>Número de libros apilados: " + PilaDeLibros.size());
        this.LeerLibro(PilaDeLibros.pop());
        System.out.println(">>Número de libros apilados: " + PilaDeLibros.size());
        
    }
    
    public void LeerLibro(Libro Libro)
    {
        System.out.print(">>Estoy leyendo el libro: " + Libro.Nombre + "("+Libro.Autor+")");
    }
    
}
