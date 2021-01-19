package model;

import javax.persistence.*;

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
}
