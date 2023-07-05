package com.welcome.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl.Position", schema = "dbo", catalog = "demoweb")
public class Position {
    public Position() {
    }

    @Id
    @Column(name = "position_id", nullable = false, columnDefinition = "char(10)")
    private String positionId;


    public Position(String positionId, String positionName, List<User> userList) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.userList = userList;
    }

    @Basic
    @Column(name = "position_name", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String positionName;

    @OneToMany(mappedBy = "position")
    private List<User> userList;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position that = (Position) o;

        if (positionId != null ? !positionId.equals(that.positionId) : that.positionId != null) return false;
        if (positionName != null ? !positionName.equals(that.positionName) : that.positionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = positionId != null ? positionId.hashCode() : 0;
        result = 31 * result + (positionName != null ? positionName.hashCode() : 0);
        return result;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
