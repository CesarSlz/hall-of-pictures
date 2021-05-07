package com.asgardians.hallofpictures.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.asgardians.hallofpictures.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
