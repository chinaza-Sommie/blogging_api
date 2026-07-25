package com.bloggingapp.blogging;

import org.springframework.stereotype.Controller;
import java.util.UUID;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class BloggingController {
    
    // private final BloggingRepository bloggingRepository;
    public BloggingService bloggingService;

    public BloggingController(BloggingService bloggingService, BloggingRepository bloggingRepository){
        this.bloggingService = bloggingService;
        // this.bloggingRepository = bloggingRepository;
    }
    
    @PostMapping("/posts")
    public Posts createPosts(Posts posts){
        return bloggingService.createPosts(posts);
    }

    public Posts updatePosts(Posts post){
        return bloggingService.updatePosts(post);
    }

    public void deletePosts(UUID id){
        bloggingService.deletePosts(id);
    }

    public void getPost(UUID id){
        bloggingService.getPost(id);
    }

    public List<Posts> getAllPosts(Posts posts){
        return bloggingService.getAllPosts();
    }

    public Posts filterPosts(String filterWord){
        return bloggingService.filterPosts(filterWord);
    }

}
