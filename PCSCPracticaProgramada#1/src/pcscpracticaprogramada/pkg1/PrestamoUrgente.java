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
public class PrestamoUrgente extends Prestamo{
    private int duracion;
    private int costoPorDia = 525;

    public PrestamoUrgente(Libro libro, Usuario usuario) {
        super(libro, usuario);
    }
   @Override
    public int calcularCosto(){
        int costoFinal;
        duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dias que desea poseer el libro: "));
        costoFinal = duracion*costoPorDia;
        return costoFinal;
    }
    
    public void validarPrestamo(Libro libro, Usuario usuario) throws Exception {
        if (!libro.isDisponible()) {
            throw new Exception("El libro no esta disponible");
        }
        if (usuario.getEmail() == null) {
            throw new Exception("El usuario no esta registrado");
        }
    }
    public void realizarPrestamo(Libro libro, Usuario usuario){
        try{
            validarPrestamo(libro, usuario);
            int costo = calcularCosto();
            JOptionPane.showMessageDialog(null, "El usuario: " +usuario+ " realizo un prestamo de: " +costo+ " por el libro: " +libro+ " exitosamente!");
            libro.setDisponible(false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
    }   
}
