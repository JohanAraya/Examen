package com.cenfotec.examen.examen.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cedulaJuridica;
    private String direccion;
    private String telefono;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENTE_ID", referencedColumnName = "ID")
    private List<Cliente> clientes;


    public Cliente() {
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente(String cedulaJuridica, String direccion, String telefono) {
        this.cedulaJuridica = cedulaJuridica;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder("Cliente(");
        value.append("Id: ");
        value.append(id);
        value.append(", Cedula Juridica: ");
        value.append(cedulaJuridica);
        value.append(", Direccion: ");
        value.append(direccion);
        value.append(", Telefono: ");
        value.append(telefono);
        value.append(")");
        return value.toString();
    }
}
