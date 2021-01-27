package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    private Admin admin;
    @ManyToOne
    private Channel channel;
    @ManyToOne
    private Teacher teacher;
    @ManyToOne
    private Parent parent;
    private Date date;
    private String postContent;

    public Post() {
    }

    public Post(String postContent) {
        this.postContent = postContent;
    }

    public Integer getId() {
        return id;
    }

    public Post setId(Integer id) {
        this.id = id;
        return this;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Post setAdmin(Admin admin) {
        this.admin = admin;
        return this;
    }

    public Channel getChannel() {
        return channel;
    }

    public Post setChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Post setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }

    public Parent getParent() {
        return parent;
    }

    public Post setParent(Parent parent) {
        this.parent = parent;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Post setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getPostContent() {
        return postContent;
    }

    public Post setPostContent(String postContent) {
        this.postContent = postContent;
        return this;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", admin=" + admin +
                ", channel=" + channel +
                ", teacher=" + teacher +
                ", parent=" + parent +
                ", date=" + date +
                ", postContent='" + postContent + '\'' +
                '}';
    }
}
