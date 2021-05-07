package com.asgardians.hallofpictures.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asgardians.hallofpictures.model.Post;
import com.asgardians.hallofpictures.service.IPostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

	private final IPostService service;
	
	@PostMapping
	public void createPost(@RequestBody Post post) {
		service.createPost(post);
	}
	
	@GetMapping
	public List<Post> retrieveAllPost() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Post retrieveById(@PathVariable("id") String id) {
		return service.findById(id);
	}
	
	// update
	
	// delete
}
