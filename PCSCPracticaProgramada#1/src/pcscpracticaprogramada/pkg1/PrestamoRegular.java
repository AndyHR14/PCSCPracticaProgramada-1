/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class PrestamoRegular extends Prestamo{
  private int duracion;
    // Atributo que define el costo por día de préstamo (360 unidades de moneda por día)
    private int costoPorDia = 360;

    // Constructor de la clase PrestamoRegular, que llama al constructor de la clase padre Prestamo
    public PrestamoRegular(Libro libro, Usuario usuario) {
        super(libro, usuario); // Inicializa el préstamo con el libro y el usuario
    }

    // Sobrescribe el método calcularCosto para calcular el costo total del préstamo
    @Override
    public int calcularCosto() {
        int costoFinal;
        // Solicita al usuario ingresar la cantidad de días que desea el libro a través de un cuadro de diálogo
        duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de días que desea poseer el libro: "));
        // Calcula el costo multiplicando la duración por el costo diario
        costoFinal = duracion * costoPorDia;
        // Retorna el costo calculado
        return costoFinal;
    }
    
    // Método que valida si el préstamo puede realizarse
    public void validarPrestamo(Libro libro, Usuario usuario) throws Exception {
        // Si el libro no está disponible, lanza una excepción con el mensaje correspondiente
        if (!libro.isDisponible()) {
            throw new Exception("El libro no está disponible");
        }
        // Si el usuario no tiene un email registrado, lanza una excepción con el mensaje correspondiente
        if (usuario.getEmail() == null) {
            throw new Exception("El usuario no está registrado");
        }
    }

    // Método para realizar el préstamo del libro a un usuario
    public void realizarPrestamo(Libro libro, Usuario usuario) {
        try {
            // Valida las condiciones para realizar el préstamo
            validarPrestamo(libro, usuario);
            // Calcula el costo del préstamo
            int costo = calcularCosto();
            // Muestra un mensaje de éxito con los detalles del préstamo
            JOptionPane.showMessageDialog(null, "El usuario: " + usuario + " realizó un préstamo de: " + costo + " por el libro: " + libro + " exitosamente!");
            // Cambia el estado del libro a no disponible (prestado)
            libro.setDisponible(false);
        } catch (Exception e) {
            // Si ocurre un error, muestra un mensaje con la descripción del error
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }   
}
