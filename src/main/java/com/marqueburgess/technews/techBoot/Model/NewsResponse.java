package com.marqueburgess.technews.techBoot.Model;

import java.util.List;

import lombok.Data;

@Data
public class NewsResponse {

	private String status;
	private Integer results;
	private List<Articles> articles;

}
