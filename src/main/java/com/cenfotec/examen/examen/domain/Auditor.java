package com.cenfotec.examen.examen.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auditor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String fechaNacimiento;
    private String telefono;
    private String correo;
    private String disponibilidad;
    private String especialidad;

    public Auditor() {
    }

    public Auditor(String nombre, String apellido1, String apellido2, String direccion,
                   String fechaNacimiento, String telefono, String correo, String disponibilidad, String especialidad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.disponibilidad = disponibilidad;
        this.especialidad = especialidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder("Auditor(");
        value.append("Id: ");
        value.append(id);
        value.append(", Nombre: ");
        value.append(nombre);
        value.append(", Primer apellido: ");
        value.append(apellido1);
        value.append(", Segundo apellido: ");
        value.append(apellido2);
        value.append(", Direccion: ");
        value.append(direccion);
        value.append(", Fecha de nacimiento: ");
        value.append(fechaNacimiento);
        value.append(", Telefono: ");
        value.append(telefono);
        value.append(", Correo: ");
        value.append(correo);
        value.append(", Disponibilidad: ");
        value.append(disponibilidad);
        value.append(", Especialidad: ");
        value.append(especialidad);
        value.append(")");
        return value.toString();
    }
}
