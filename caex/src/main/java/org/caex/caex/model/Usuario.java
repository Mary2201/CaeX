package org.caex.caex.model;

//Usuario.java

import javax.persistence.*;

@Entity
public class Usuario {

 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(length = 50, unique = true)
 private String nombre;

 @Column(length = 50)
 private String email;

 @Column(length = 64)
 private String contrasena;

 @Column(length = 20)
 private String rol; // ADMIN, OPERADOR, ESTUDIANTE

 // Getters y setters
 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }

 public String getNombre() { return nombre; }
 public void setNombre(String nombre) { this.nombre = nombre; }

 public String getEmail() { return email; }
 public void setEmail(String email) { this.email = email; }

 public String getContrasena() { return contrasena; }
 public void setContrasena(String contrasena) { this.contrasena = contrasena; }

 public String getRol() { return rol; }
 public void setRol(String rol) { this.rol = rol; }
}
