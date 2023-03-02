package com.panificados.panificadosScafati.Dto;

import javax.validation.constraints.NotBlank;

public class PersonaDto {
   @NotBlank
    private String nombre;
   @NotBlank
   private String apellido;
   @NotBlank
   private String email;
   @NotBlank
   private String telefono;
   @NotBlank
   private String direccion;
   @NotBlank
    private String sobre_nosotros;

   //constructores


    public PersonaDto() {
    }

    public PersonaDto(String nombre, String apellido, String email, String telefono, String direccion, String sobre_nosotros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sobre_nosotros = sobre_nosotros;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSobre_nosotros() {
        return sobre_nosotros;
    }

    public void setSobre_nosotros(String sobre_nosotros) {
        this.sobre_nosotros = sobre_nosotros;
    }
}

