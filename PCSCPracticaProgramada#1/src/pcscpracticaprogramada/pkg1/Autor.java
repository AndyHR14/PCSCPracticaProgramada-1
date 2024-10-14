/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy
 */
// Constructor que inicializa el nombre, el apellido y crea la lista de libros
    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.libros = new ArrayList<>(); // Se inicia con una lista vacía de libros
    }
    
    // Método para agregar un libro a la lista de libros del autor
    public void agregarLibro(Libro libro){
       libros.add(libro); // Agrega el libro proporcionado a la lista
    }

    // Método para obtener el nombre del autor
    public String getNombre() {
        return nombre;
    }

    // Método para cambiar el nombre del autor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el apellido del autor
    public String getApellido() {
        return apellido;
    }

    // Método para cambiar el apellido del autor
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método para obtener la lista de libros del autor
    public List<Libro> getLibros() {
        return libros;
    }

    // Método para establecer una lista de libros y reemplaza la actual
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
