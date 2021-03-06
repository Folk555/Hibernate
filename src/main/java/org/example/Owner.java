package org.example;

//import org.hibernate.annotations.CascadeType;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "\"CAR_OWNERS\"")
public class Owner {

    @Id
    @Column(name = "\"ID\"")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "\"NAME\"")
    private String name;
    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    private int age;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Auto> autos;

    public Owner() {
    }

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
        autos = new ArrayList<>();
    }

    public void addAuto(Auto auto) {
        auto.setUser(this);
        autos.add(auto);
    }

    public void removeAuto(Auto auto) {
        autos.remove(auto);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}