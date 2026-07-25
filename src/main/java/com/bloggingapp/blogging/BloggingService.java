package com.bloggingapp.blogging;

import org.springframework.stereotype.Service;
// import java.util.Long;
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

    public Posts updatePosts(Long id, Posts posts){
        return posts;
    }

    public void deletePosts(Long id){
        bloggingRepository.deleteById(id);
    }

    public Posts getPost(Long id){
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
