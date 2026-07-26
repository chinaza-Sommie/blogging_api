package com.bloggingapp.blogging;

// import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

public interface BloggingRepository extends ListCrudRepository<Posts, Long>{

    @Query(value= 
        "SELECT * FROM posts WHERE LOWER(title) LIKE LOWER(CONCAT('%', :filteredword , '%')) OR LOWER(content) LIKE LOWER(CONCAT('%', :filteredword , '%')) OR LOWER(category) LIKE LOWER(CONCAT('%', :filteredword , '%')) " , nativeQuery = true)
    public List<Posts> findByFilteredWord(@Param("filteredword") String filteredword);
    
}