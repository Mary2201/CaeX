package org.caex.caex.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Periodo {

 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Stereotype("DATE")
 private Date fechaInicio;

 @Stereotype("DATE")
 private Date fechaFin;

 // Getters y setters
 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }

 public Date getFechaInicio() { return fechaInicio; }
 public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

 public Date getFechaFin() { return fechaFin; }
 public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }
}
