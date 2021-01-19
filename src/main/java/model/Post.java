package model;

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
    @OneToMany

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
}
