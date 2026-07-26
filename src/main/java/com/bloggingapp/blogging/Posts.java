package com.bloggingapp.blogging;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name="posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String category;

    @ElementCollection
    private List<String> tags;
    private Instant createdAt;
    private Instant updatedAt;

    public Posts(){
        this("", "", "", new ArrayList<>());
    }

    public Posts(String title, String content, String category, List<String> tags){
        this.title = title;
        this.content = content;
        this.category = category;
        this.tags= tags;
    }

    @PrePersist
    public void onCreate(){
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = Instant.now();
    }

    public Long getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getContent(){
        return this.content;
    }

    public String getCategory(){
        return this.category;
    }

    public List<String> getTags(){
        return this.tags;
    }

    public Instant getCreatedAt(){
        return this.createdAt;
    }

    public Instant getUpdatedAt(){
        return this.updatedAt;
    }
    public void setTitle(String title){
        this.title= title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setCategory(String category){
        this.category= category;
    }

    public void setTags(List<String> tags){
        this.tags= tags;
    }

    // public void setCreatedAt(Instant createdAt){
    //     this.createdAt = createdAt;
    // }

    // public void setUpdatedAt(Instant updatedAt){
    //     this.updatedAt = updatedAt;
    // }
}
