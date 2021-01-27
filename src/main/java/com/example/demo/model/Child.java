package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Children")
public class Child {
    @Id
    @GeneratedValue
    private Integer id;
    private String lastName;
    private String firstName;
    private int age;
    @ManyToOne
    private Channel channel;
    @ManyToOne
    private Parent parent;
    @ManyToOne
    private Admin admin;
    @ManyToMany
    private List<Teacher> teacher;

    public Child() {
    }

    public Child(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public Child setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Child setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Child setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Child setAge(int age) {
        this.age = age;
        return this;
    }

    public Channel getChannel() {
        return channel;
    }

    public Child setChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public Parent getParent() {
        return parent;
    }

    public Child setParent(Parent parent) {
        this.parent = parent;
        return this;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Child setAdmin(Admin admin) {
        this.admin = admin;
        return this;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public Child setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
        return this;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", channel=" + channel +
                ", parent=" + parent +
                ", admin=" + admin +
                ", teacher=" + teacher +
                '}';
    }
}
