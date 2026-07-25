package com.bloggingapp.blogging;

import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.List;

@Service
public class BloggingService {
    public BloggingRepository bloggingRepository;
    public BloggingService(BloggingRepository bloggingRepository){
        this.bloggingRepository = bloggingRepository;
    }

    // the funtionalities needed => create, update, delete, get 1 post, get all blog posts, filter post by a given term

    public Posts createPosts(Posts posts){
        return bloggingRepository.save(posts);
    }

    public Posts updatePosts(UUID id, Posts posts){
        return posts;
    }

    public void deletePosts(UUID id){
        bloggingRepository.deleteById(id);
    }

    public Posts getPost(UUID id){
        return bloggingRepository.findById(id).orElse(null);
    }

    public List<Posts> getAllPosts(){
        return bloggingRepository.findAll();
    }

    public Posts filterPosts(String filterWord){
        // return bloggingRepository.
        return null;
    }
}
