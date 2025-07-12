package org.caex.caex.model;

import javax.persistence.*;

@Entity
public class Categoria {

 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(length = 50)
 private String nombre;

 // Getters y setters
 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }

 public String getNombre() { return nombre; }
 public void setNombre(String nombre) { this.nombre = nombre; }
}
