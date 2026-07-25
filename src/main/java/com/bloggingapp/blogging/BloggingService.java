package com.bloggingapp.blogging;

import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class BloggingService {
    public BloggingRepository bloggingRepository;
    public BloggingService(BloggingRepository bloggingRepository){
        this.bloggingRepository = bloggingRepository;
    }

    // the funtionalities needed => create, update, delete, get 1 post, get all blog posts, filter post by a given term

    public Posts createPosts(Posts posts){
        return posts;
    }

    public Posts updatePosts(Posts posts){
        return posts;
    }

    public void deletePosts(UUID id){

    }

    public void getPost(UUID id){
        
    }

    public Posts getAllPosts(){
        return null;
    }

    public Posts filterPosts(String filterWord){
        return null;
    }
}
