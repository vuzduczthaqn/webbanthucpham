package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl.Position", schema = "dbo", catalog = "demoweb")
@Data
public class Position implements Serializable {
    @Id
    @Column(name = "position_id", nullable = false, columnDefinition = "char(10)")
    private String positionId;
    @Basic
    @Column(name = "position_name", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String positionName;

    @OneToMany(mappedBy = "position")
    private List<User> userList;
}
