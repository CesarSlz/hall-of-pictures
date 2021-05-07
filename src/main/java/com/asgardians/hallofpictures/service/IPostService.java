package com.asgardians.hallofpictures.service;

import java.util.List;

import com.asgardians.hallofpictures.model.Post;

public interface IPostService {

	void createPost(Post post);
	List<Post> findAll();
	Post findById(String id);
	Post update(String id, Post post);
	void delete(String id);
}
