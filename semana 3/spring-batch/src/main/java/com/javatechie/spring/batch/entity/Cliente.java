package com.javatechie.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @Column(name = "cliente_id")
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "sexo")
    private String sexo;
    
    @Column(name = "celular")
    private String celular;
    
    @Column(name = "pais")
    private String pais;
    
    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;
    
}
