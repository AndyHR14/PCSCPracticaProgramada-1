/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

/**
 *
 * @author Andy
 */
public class Usuario extends Persona{
      // Atributo protegido que almacena la fecha de registro del usuario
    protected String fechaDeRegistro;

    // Constructor de la clase Usuario, que recibe la fecha de registro, nombre y email
    public Usuario(String fechaDeRegistro, String nombre, String email) {
        super(nombre, email); // Llama al constructor de la clase Persona para inicializar nombre y email
        this.fechaDeRegistro = fechaDeRegistro; // Asigna la fecha de registro
    }
    
    // Método para obtener el email del usuario
    @Override
    public String getEmail() {
        return email;
    }

    // Método para obtener la fecha de registro del usuario
    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    // Método para establecer una nueva fecha de registro del usuario
    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    // Método para obtener el nombre del usuario
    @Override
    public String getNombre() {
        return nombre;
    }
