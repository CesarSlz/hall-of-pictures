package com.asgardians.hallofpictures.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Post {

	@Id
	private String _id;
	private String name;
	private String description;
	private String picture;
	
	@CreatedDate
	private LocalDateTime createdDate;
	
}
