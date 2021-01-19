package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private  Integer id;
    @ManyToOne
    private Parent parent;
    @ManyToOne
    private Teacher teacher;
    private String text;
    private LocalDate date;
    @ManyToOne
    private Admin admin;

    public Integer getId() {
        return id;
    }

    public Message setId(Integer id) {
        this.id = id;
        return this;
    }

    public Parent getParent() {
        return parent;
    }

    public Message setParent(Parent parent) {
        this.parent = parent;
        return this;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Message setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Message setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Message setAdmin(Admin admin) {
        this.admin = admin;
        return this;
    }
}
