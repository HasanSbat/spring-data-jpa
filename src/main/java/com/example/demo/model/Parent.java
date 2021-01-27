package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Parent {
    @Id
    @GeneratedValue
    private Integer id;
    private String fullName;
    private String password;
    private String optionamlEtraPartner;
    private String eMail;
    private String gsmNumber;

    @OneToMany
    private List<Message> message;
    @OneToMany
    private List<Child> child;
    @ManyToMany
    private List<Channel> channel;
    @OneToMany
    private List<Post> posts;
    @ManyToOne
    private Admin admin;

    public Parent() {
    }

    public Parent(String fullName , String password) {
        this.fullName = fullName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public Parent setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Parent setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Parent setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getOptionamlEtraPartner() {
        return optionamlEtraPartner;
    }

    public Parent setOptionamlEtraPartner(String optionamlEtraPartner) {
        this.optionamlEtraPartner = optionamlEtraPartner;
        return this;
    }

    public String geteMail() {
        return eMail;
    }

    public Parent seteMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public Parent setGsmNumber(String gsmNummer) {
        this.gsmNumber = gsmNummer;
        return this;
    }

    public List<Message> getMessage() {
        return message;
    }

    public Parent setMessage(List<Message> message) {
        this.message = message;
        return this;
    }

    public List<Child> getChild() {
        return child;
    }

    public Parent setChild(List<Child> child) {
        this.child = child;
        return this;
    }

    public List<Channel> getChannel() {
        return channel;
    }

    public Parent setChannel(List<Channel> channel) {
        this.channel = channel;
        return this;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Parent setPosts(List<Post> posts) {
        this.posts = posts;
        return this;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Parent setAdmin(Admin admin) {
        this.admin = admin;
        return this;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", optionamlEtraPartner='" + optionamlEtraPartner + '\'' +
                ", eMail='" + eMail + '\'' +
                ", gsmNumber='" + gsmNumber + '\'' +
                ", message=" + message +
                ", child=" + child +
                ", channel=" + channel +
                ", posts=" + posts +
                ", admin=" + admin +
                '}';
    }
}
