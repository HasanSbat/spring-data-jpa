package model;

import org.hibernate.type.descriptor.spi.JdbcRecommendedSqlTypeMappingContext;

import javax.persistence.*;
import java.util.List;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    private  Integer id;
    private String fullName;
    private String password;
    @OneToMany
    private List<Message> messages;
    @ManyToMany
    private List<Channel> channel;
    @OneToMany
    private List<Post> posts;
    @OneToMany
    private List<Parent> parent;

    public Admin(String fullName , String password) {
        this.fullName = fullName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public Admin setId( Integer id) {
        this.id = id;
        return this;
    }
    public String getFullName() {
        return fullName;
    }

    public Admin setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public Admin setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public List<Channel> getChannel() {
        return channel;
    }

    public Admin setChannel(List<Channel> channel) {
        this.channel = channel;
        return this;
    }
    public List<Post> getPosts() {
        return posts;
    }

    public Admin setPosts(List<Post> posts) {
        this.posts = posts;
        return this;
    }

    public List<Parent> getParent() {
        return parent;
    }

    public Admin setParent(List<Parent> parent) {
        this.parent = parent;
        return this;
    }
}
