package model;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Validated
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id;
    private String username;
    private String phoneNumber;
    private String address;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public User() {
    }

    public User(String username, String address, String phoneNumber) {
        this.username = username;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
