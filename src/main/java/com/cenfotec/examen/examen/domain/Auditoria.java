package com.cenfotec.examen.examen.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String auditoriaNombre;
    private String fecha;
    private String clienteVisita;

    public Auditoria() {
    }

    public Auditoria(String auditoriaNombre, String fecha, String clienteVisita) {
        this.auditoriaNombre = auditoriaNombre;
        this.fecha = fecha;
        this.clienteVisita = clienteVisita;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuditoriaNombre() {
        return auditoriaNombre;
    }

    public void setAuditoriaNombre(String auditoriaNombre) {
        this.auditoriaNombre= auditoriaNombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getClienteVisita() {
        return clienteVisita;
    }

    public void setClienteVisita(String clienteVisita) {
        this.clienteVisita = clienteVisita;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder("Auditoria(");
        value.append("Id: ");
        value.append(id);
        value.append(", Auditoria: ");
        value.append(auditoriaNombre);
        value.append(", Fecha: ");
        value.append(fecha);
        value.append(", Cliente a visitar: ");
        value.append(clienteVisita);
        value.append(")");
        return value.toString();
    }
}
