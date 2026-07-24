package com.bloggingapp.blogging;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="posts")
public class Posts {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String category;
    private String tags;
    private Instant createdAt;
    private String updatedAt;

    public Posts(){
        this("", "", "", "", Instant.now(), "");
    }

    public Posts(String title, String content, String category, String tags, Instant createdAt, String updatedAt){
        this.title = title;
        this.content = content;
        this.category = category;
        this.tags= tags;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }

    public Long getId(Long id){
        return this.id;
    }

    public String getTitle(String title){
        return this.title;
    }

    public String getContent(String content){
        return this.content;
    }

    public String getCategory(String category){
        return this.category;
    }

    public String getTags(String tags){
        return this.tags;
    }

    public Instant getCreatedAt(Instant createdAt){
        return this.createdAt;
    }

    public String getUpdatedAt(String updatedAt){
        return this.updatedAt;
    }
    public String setTitle(String title){
        return this.title= title;
    }

    public String setContent(String content){
        return this.content = content;
    }

    public String setCategory(String category){
        return this.category= category;
    }

    public String setTags(String tags){
        return this.tags= tags;
    }

    public Instant setCreatedAt(Instant createdAt){
        return this.createdAt = createdAt;
    }

    public String setUpdatedAt(String updatedAt){
        return this.updatedAt = updatedAt;
    }
}
