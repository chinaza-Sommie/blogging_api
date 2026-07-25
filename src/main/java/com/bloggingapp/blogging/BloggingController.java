package com.bloggingapp.blogging;

import org.springframework.stereotype.Controller;
import java.util.UUID;

@Controller
public class BloggingController {
    
    // private final BloggingRepository bloggingRepository;
    public BloggingService bloggingService;

    public BloggingController(BloggingService bloggingService, BloggingRepository bloggingRepository){
        this.bloggingService = bloggingService;
        // this.bloggingRepository = bloggingRepository;
    }

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

    public Posts getAllPosts(Posts posts){
        return bloggingService.getAllPosts();
    }

    public Posts filterPosts(String filterWord){
        return bloggingService.filterPosts(filterWord);
    }

}
