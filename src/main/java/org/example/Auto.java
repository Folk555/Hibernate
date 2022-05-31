package org.example;

import jakarta.persistence.*;


@Entity
@Table(name = "CARS")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "model")
    private String model;

    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    private String color;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Owner owner;

    public Auto() {
    }

    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getUser() {
        return owner;
    }

    public void setUser(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return color + " " + model;
    }
}