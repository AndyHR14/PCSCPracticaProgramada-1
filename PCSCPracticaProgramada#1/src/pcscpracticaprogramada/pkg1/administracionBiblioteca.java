package pcscpracticaprogramada.pkg1;

import java.util.*;

/**
 *
 * @author Andy
 */
public class AdministracionBiblioteca {
   public AdministracionBiblioteca() {
        coleccionLibros = new ArrayList<>();
        coleccionUsuarios = new ArrayList<>();
        setLibrosUnicos = new HashSet<>();
        mapPrestamos = new HashMap<>();
    }

    // Metodo para agregar un libro a la colección general de la biblioteca
    public void agregarLibro(Libro libro) {
        coleccionLibros.add(libro); // Agrega el libro a la lista de libros
        setLibrosUnicos.add(libro);  // También lo agrega al conjunto para evitar duplicados
    }

    // Metodo para agregar un usuario a la biblioteca
    public void agregarUsuario(Usuario usuario) {
        coleccionUsuarios.add(usuario); // Agrega el usuario a la lista de usuarios
    }

    // Metodo para mostrar todos los libros disponibles en la biblioteca
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        // Recorre la coleccion de libros y muestra su titulo y el nombre del autor
        for (Libro libro : coleccionLibros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor().getNombre());
        }
    }

    // Metodo para ordenar los libros según su anioo de publicación y mostrarlos
    public void ordenarLibrosPorAnio() {
        // Crea una lista a partir de la colección de libros para poder ordenarla
        List<Libro> librosOrdenados = new ArrayList<>(coleccionLibros);
        // Ordena la lista de libros según el anio de publicacion de forma ascendente
        Collections.sort(librosOrdenados, Comparator.comparingInt(Libro::getAnioPublicacion));
        System.out.println("Libros ordenados por anio de publicación:");
        // Muestra cada libro con su titulo y su anioo de publicacion
        for (Libro libro : librosOrdenados) {
            System.out.println(libro.getTitulo() + " - " + libro.getAnioPublicacion());
        }
    }

    // Metodo para buscar un libro por su titulo
    public Libro buscarLibroPorTitulo(String titulo) {
        // Recorre la coleccion de libros
        for (Libro libro : coleccionLibros) {
            // Si el titulo del libro coincide con el buscado y lo devuelve
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // Si no encuentra el libro, devuelve null
    }

    // Método para registrar el prestamo de un libro a un usuario
    public void registrarPrestamo(Usuario usuario, Libro libro) {
        // Si el usuario no tiene prestamos registrados aun, crea una nueva lista de libros para el
        if (!mapPrestamos.containsKey(usuario)) {
            mapPrestamos.put(usuario, new ArrayList<>());
        }
        // Agrega el libro a la lista de prestamos del usuario
        mapPrestamos.get(usuario).add(libro);
    }

    // Metodo para mostrar los libros que un usuario tiene prestados
    public void mostrarPrestamosDeUsuario(Usuario usuario) {
        // Obtiene la lista de libros prestados al usuario
        List<Libro> librosPrestados = mapPrestamos.get(usuario);
        // Si el usuario tiene libros prestados, los muestra
        if (librosPrestados != null) {
            System.out.println("Libros prestados al usuario " + usuario.getNombre() + ":");
            for (Libro libro : librosPrestados) {
                System.out.println(libro.getTitulo());
            }
        } else {
            // Si no tiene libros prestados, informa de ello
            System.out.println("El usuario no tiene libros prestados.");
        }
    }
}
