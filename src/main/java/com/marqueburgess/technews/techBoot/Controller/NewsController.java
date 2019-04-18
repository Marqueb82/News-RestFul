package com.marqueburgess.technews.techBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marqueburgess.technews.techBoot.Model.Articles;
import com.marqueburgess.technews.techBoot.Model.NewsAPI_Service;

@Controller
public class NewsController {

	@Autowired
	private NewsAPI_Service theNews;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public List<Articles> getArticles() {
		List<Articles> articleList = theNews.getResponse();
		return articleList;
	}

	@RequestMapping(value = "/sports", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public List<Articles> getSportsArticles() {
		List<Articles> articleList = theNews.getSportsResponse();
		return articleList;
	}

}
