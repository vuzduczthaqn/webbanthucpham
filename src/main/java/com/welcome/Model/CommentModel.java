package com.welcome.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class CommentModel implements Serializable {
    @Id
    private String idBegin;
    private String content;
    private String userId;


    private Long newId;
    private String createdDate;
    private String modifieDate;
    private String createdBy;
    private String modifieBy;

    public CommentModel(String idBegin, String content, String userId, Long newId, String createdDate, String modifieDate, String createdBy, String modifieBy) {
        this.idBegin = idBegin;
        this.content = content;
        this.userId = userId;
        this.newId = newId;
        this.createdDate = createdDate;
        this.modifieDate = modifieDate;
        this.createdBy = createdBy;
        this.modifieBy = modifieBy;
    }

    public String getIdBegin() {
        return idBegin;
    }

    public void setIdBegin(String idBegin) {
        this.idBegin = idBegin;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifieDate() {
        return modifieDate;
    }

    public void setModifieDate(String modifieDate) {
        this.modifieDate = modifieDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifieBy() {
        return modifieBy;
    }

    public void setModifieBy(String modifieBy) {
        this.modifieBy = modifieBy;
    }

    public CommentModel() {
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getNewId() {
        return newId;
    }

    public void setNewId(Long newId) {
        this.newId = newId;
    }
}
