package com.lee.thymeleaf.bean;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-25 15:42
 **/
public class User {
    private long id ;
    private String username ;
    private String address ;

    @Override
    public String toString() {
        return "UserController{" +
                "id=" + id +
                ", username=" + username +
                ", address=" + address +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
