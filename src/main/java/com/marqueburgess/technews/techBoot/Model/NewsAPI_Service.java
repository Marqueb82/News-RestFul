package com.marqueburgess.technews.techBoot.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NewsAPI_Service {

	@Value("${apikey}")
	private String apikey;

	RestTemplate restTemplate = new RestTemplate();

	public List<Articles> getResponse() {

		String url = "https://newsapi.org/v2/top-headlines?country=us&category=technology&apiKey=" + apikey;
		NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
		return response.getArticles();
	}

	public List<Articles> getSportsResponse() {

		String url = "https://newsapi.org/v2/top-headlines?country=us&category=sports&apiKey=" + apikey;
		NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
		return response.getArticles();
	}

}
