package com.apispringboot.api_hr_association.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    private String mail;

    private String password;

}
/*
Modélisez la table en entité Java
@Data est une annotation Lombok. Nul besoin d’ajouter les getters et les setters. La librairie Lombok s’en charge pour nous. Très utile pour alléger le code.

@Entity est une annotation qui indique que la classe correspond à une table de la base de données.

@Table(name=”employees”) indique le nom de la table associée.

L’attribut id correspond à la clé primaire de la table, et est donc annoté @Id. D’autre part, comme l’id est auto-incrémenté, j’ai ajouté l’annotation @GeneratedValue(strategy = GenerationType.IDENTITY).

Enfin, firstName et lastName sont annotés avec @Column pour faire le lien avec le nom du champ de la table.

 */
