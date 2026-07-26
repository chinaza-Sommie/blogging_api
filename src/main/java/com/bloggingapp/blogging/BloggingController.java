package com.bloggingapp.blogging;

// import java.util.Long;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    }
    
    @PostMapping(value= "/posts", produces="application/json")
    public Posts createPosts(@RequestBody Posts posts){
        try{
            return bloggingService.createPosts(posts);
        }catch(IllegalArgumentException e){
            throw new NullPointerException("Invalid Input");
        }
    }

    @PutMapping(value= "/posts/{id}", produces="application/json")
    public Posts updatePosts(@PathVariable Long id, @RequestBody Posts post){
        return bloggingService.updatePosts(id, post);
    }

    @DeleteMapping(value="/posts/{id}", produces="application/json")
    public void deletePosts(@PathVariable Long id){
        bloggingService.deletePosts(id);
    }

    @GetMapping(value="/posts/{id}", produces="application/json")
    public Posts getPost(@PathVariable Long id){
        return bloggingService.getPost(id);
    }

    @GetMapping(value="/posts", produces="application/json")
    public List<Posts> getAllPosts(@RequestParam(required = false) String term){
        if(term != null && !term.isBlank()){
            return bloggingService.filterPosts(term);
        }

        return bloggingService.getAllPosts();
    }

    // @GetMapping(value="/posts/filter", produces="application/json")
    // public List<Posts> filterPosts(@RequestParam String filterWord){
    //     return bloggingService.filterPosts(filterWord);
    // }

}
