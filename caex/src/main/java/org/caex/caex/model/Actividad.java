package org.caex.caex.model;


import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Actividad {

 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(length = 100)
 private String titulo;

 @Column(length = 200)
 private String descripcion;

 @Column(length = 20)
 private String prioridad;

 @Stereotype("DATE")
 private Date fechaLimite;

 private boolean completada;

 @ManyToOne
 private Categoria categoria;

 @ManyToOne
 private Usuario usuario;

 // Getters y setters
 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }

 public String getTitulo() { return titulo; }
 public void setTitulo(String titulo) { this.titulo = titulo; }

 public String getDescripcion() { return descripcion; }
 public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

 public String getPrioridad() { return prioridad; }
 public void setPrioridad(String prioridad) { this.prioridad = prioridad; }

 public Date getFechaLimite() { return fechaLimite; }
 public void setFechaLimite(Date fechaLimite) { this.fechaLimite = fechaLimite; }

 public boolean isCompletada() { return completada; }
 public void setCompletada(boolean completada) { this.completada = completada; }

 public Categoria getCategoria() { return categoria; }
 public void setCategoria(Categoria categoria) { this.categoria = categoria; }

 public Usuario getUsuario() { return usuario; }
 public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}
