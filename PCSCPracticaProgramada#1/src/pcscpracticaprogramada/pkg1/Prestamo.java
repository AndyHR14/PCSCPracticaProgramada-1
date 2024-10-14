/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

/**
 *
 * @author Andy
 */
public abstract class Prestamo {
     protected Libro libro;
    // Atributo protegido que almacena el usuario que realiza el préstamo
    protected Usuario usuario;

    // Constructor que inicializa el libro y el usuario del préstamo
    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro; // Asigna el libro proporcionado
        this.usuario = usuario; // Asigna el usuario proporcionado
    }
    
    // Método abstracto que calcula el costo del préstamo
    // Este método debe ser implementado por las clases que hereden de Prestamo
    public abstract int calcularCosto();
