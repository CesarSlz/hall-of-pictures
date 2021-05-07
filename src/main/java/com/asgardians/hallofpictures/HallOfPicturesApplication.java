package com.asgardians.hallofpictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import com.asgardians.hallofpictures.dao.PostRepository;
import com.asgardians.hallofpictures.model.Post;

@SpringBootApplication
@EnableMongoAuditing
public class HallOfPicturesApplication{

	@Autowired
	PostRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(HallOfPicturesApplication.class, args);
	}

}
