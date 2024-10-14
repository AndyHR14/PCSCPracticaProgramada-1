/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

/**
 *
 * @author Andy
 */
public class Persona {
    protected String nombre;
    // Atributo protegido que almacena el email de la persona
    protected String email;

    // Constructor que inicializa el nombre y el email de la persona
    public Persona(String nombre, String email) {
        this.nombre = nombre; // Asigna el nombre proporcionado
        this.email = email; // Asigna el email proporcionado
    }

    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método para cambiar el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el email de la persona
    public String getEmail() {
        return email;
    }

    // Método para cambiar el email de la persona
    public void setEmail(String email) {
        this.email = email;
    }
