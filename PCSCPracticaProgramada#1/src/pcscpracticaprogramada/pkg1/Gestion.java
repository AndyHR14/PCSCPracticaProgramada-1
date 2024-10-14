
package pcscpracticaprogramada.pkg1;

public class Gestion extends Libro {
    // Arreglo que almacena varios libros
    private Libro[] libros;

    // Constructor de la clase Gestion que inicializa el arreglo de libros y los atributos heredados de Libro
    public Gestion(Libro[] libros, String titulo, Autor autor, int anioPublicacion, boolean disponible) {
        // Llama al constructor de la clase padre (Libro) para establecer título, autor, año y disponibilidad
        super(titulo, autor, anioPublicacion, disponible);
        this.libros = libros; // Guarda el arreglo de libros proporcionado
    }
    
    // Método para mostrar los libros almacenados en el arreglo
    public void mostrarLibros() {
        // Recorre el arreglo de libros usando un bucle for
        for (int i = 0; i > libros.length; i++) {
            // Aquí debería ir el código para mostrar los libros, pero falta la implementación
        }   
    }
}
