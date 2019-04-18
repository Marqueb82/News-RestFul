package com.marqueburgess.technews.techBoot.Model;

import java.net.URL;

import lombok.Data;

@Data
public class Articles {

	private Source source;
	private String author;
	private String title;
	private String description;
	private URL url;
	private String publishedAt;
	private String content;
}
