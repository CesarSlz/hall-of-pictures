package com.asgardians.hallofpictures.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asgardians.hallofpictures.dao.PostRepository;
import com.asgardians.hallofpictures.model.Post;
import com.asgardians.hallofpictures.service.IPostService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements IPostService{

	private final PostRepository repository;
	
	@Override
	public void createPost(Post post) {
		repository.insert(post);
		
	}

	@Override
	public List<Post> findAll() {
		return repository.findAll();
	}

	@Override
	public Post findById(String id) {
		return repository.findById(id).get();
	}

	@Override
	public Post update(String id, Post post) {
		Post postUpdate = findById(id);
		postUpdate.setName(post.getName());
		postUpdate.setDescription(post.getDescription());
		postUpdate.setPicture(post.getPicture());
		
		repository.save(postUpdate);
		
		return postUpdate;
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
		
	}

}
