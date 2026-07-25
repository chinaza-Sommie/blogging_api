package com.bloggingapp.blogging;

import org.springframework.stereotype.Controller;
// import java.util.Long;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class BloggingController {
    
    // private final BloggingRepository bloggingRepository;
    public BloggingService bloggingService;

    public BloggingController(BloggingService bloggingService, BloggingRepository bloggingRepository){
        this.bloggingService = bloggingService;
        // this.bloggingRepository = bloggingRepository;
    }
    
    @PostMapping(value= "/posts", produces="application/json")
    public Posts createPosts(@RequestBody Posts posts){
        return bloggingService.createPosts(posts);
    }

    @PutMapping(value= "/posts/{id}", produces="application/json")
    public Posts updatePosts(@PathVariable Long id, @RequestBody Posts post){
        return bloggingService.updatePosts(id, post);
    }

    @DeleteMapping(value="/posts/{id}", produces="application/json")
    public void deletePosts(Long id){
        bloggingService.deletePosts(id);
    }

    @GetMapping(value="/posts/{id}", produces="application/json")
    public void getPost(Long id){
        bloggingService.getPost(id);
    }

    @GetMapping(value="/posts", produces="application/json")
    public List<Posts> getAllPosts(){
        return bloggingService.getAllPosts();
    }

    @GetMapping(value="/posts?term={filterWord}", produces="application/json")
    public Posts filterPosts(String filterWord){
        return bloggingService.filterPosts(filterWord);
    }

}
