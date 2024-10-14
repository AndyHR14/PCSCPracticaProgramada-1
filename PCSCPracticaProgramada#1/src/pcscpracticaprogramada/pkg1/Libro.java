/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

/**
 *
 * @author Andy
 */
public class Libro {
 private String titulo;
    // Atributo que almacena el autor del libro, representado por un objeto de la clase Autor
    private Autor autor;
    // Atributo que guarda el año de publicación del libro
    private int anioPublicacion;
    // Atributo que indica si el libro está disponible (true) o no (false)
    private boolean disponible;

    // Constructor que inicializa el título, autor, año de publicación y disponibilidad del libro
    public Libro(String titulo, Autor autor, int anioPublicacion, boolean disponible) {
        this.titulo = titulo; // Asigna el título del libro
        this.autor = autor; // Asigna el autor del libro
        this.anioPublicacion = anioPublicacion; // Asigna el año de publicación del libro
        this.disponible = disponible; // Establece si el libro está disponible o no
    }
    
    // Método para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }

    // Método para obtener el autor del libro
    public Autor getAutor() {
        return autor;
    }

    // Método para cambiar el autor del libro
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Método para obtener el año de publicación del libro
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Método para cambiar el año de publicación del libro
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // Método para verificar si el libro está disponible
    public boolean isDisponible() {
        return disponible;
    }

    // Método para cambiar la disponibilidad del libro
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
