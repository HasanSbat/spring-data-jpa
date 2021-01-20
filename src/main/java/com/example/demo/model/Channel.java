package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Channel {
    @Id
    @GeneratedValue
    private  Integer id;
    private String name;
    private String grade;

    @OneToMany
    private List<Child> children;
    @ManyToMany
    private List<Teacher> teachers;
    @ManyToMany
    private List<Parent> parents;
    @ManyToMany
    private List<Admin> admins;
    @OneToMany
    private List<Post> posts;

    public Integer getId() {
        return id;
    }

    public Channel setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Channel setName(String name) {
        this.name = name;
        return this;
    }

    public String getGrade() {
        return grade;
    }

    public Channel setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public List<Child> getChildren() {
        return children;
    }

    public Channel setChildren(List<Child> children) {
        this.children = children;
        return this;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Channel setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
        return this;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public Channel setParents(List<Parent> parents) {
        this.parents = parents;
        return this;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public Channel setAdmins(List<Admin> admins) {
        this.admins = admins;
        return this;
    }
    public List<Post> getPosts() {
        return posts;
    }

    public Channel setPosts(List<Post> posts) {
        this.posts = posts;
        return this;
    }

}
