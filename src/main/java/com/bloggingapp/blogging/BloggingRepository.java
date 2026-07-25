package com.bloggingapp.blogging;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

public interface BloggingRepository extends ListCrudRepository<Posts, Long>{

    
}