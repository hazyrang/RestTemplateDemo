package com.nexr.pojo;

import java.util.Date;

/**
 * Created by hazyrang on 9/6/16.
 */
public class PostPOJO {
    private long id;
    private String title;
    private String content;
    private Date created_dt;
    private Date updated_dt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated_dt() {
        return created_dt;
    }

    public void setCreated_dt(Date created_dt) {
        this.created_dt = created_dt;
    }

    public Date getUpdated_dt() {
        return updated_dt;
    }

    public void setUpdated_dt(Date updated_dt) {
        this.updated_dt = updated_dt;
    }
}
