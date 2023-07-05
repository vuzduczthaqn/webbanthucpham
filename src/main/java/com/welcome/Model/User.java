package com.welcome.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tbl.User", schema = "dbo", catalog = "demoweb")
@IdClass(UserPK.class)
public class User implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "customer_id",foreignKey = @ForeignKey(name = "FK_Customer_User"))
    private Customer customerId;
    @Id
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
    @Column(name = "username", nullable = false, length = 30)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 30)
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = password != null ? password.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
