package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private  Integer id;
    private String fullName;
    private String password;
    private String course;
    @ManyToMany
    private List<Channel> channel;
    @OneToMany
    private List<Message> messages;
    @OneToMany
    private List<Post> posts;
    @ManyToMany
    private List<Child> child;

    public Teacher(String fullName, String password) {
        this.fullName = fullName;
        this.password = password;
    }
    public Integer getId() {
        return id;
    }

    public Teacher setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getFullName() {
        return fullName;
    }

    public Teacher setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public Teacher setCourse(String course) {
        this.course = course;
        return this;
    }

    public List<Channel> getChannel() {
        return channel;
    }

    public Teacher setChannel(List<Channel> channel) {
        this.channel = channel;
        return this;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public Teacher setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Teacher setPosts(List<Post> posts) {
        this.posts = posts;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Teacher setPassword(String password) {
        this.password = password;
        return this;
    }

    public List<Child> getChild() {
        return child;
    }

    public Teacher setChild(List<Child> child) {
        this.child = child;
        return this;
    }
}
