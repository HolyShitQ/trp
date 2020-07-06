package com.frq.trp.service;

import com.frq.trp.model.Article;

import java.util.List;

public interface IArticleService {
//    PageInfo<Article> getAllArticle(Integer page, Integer pageSize);

    List<Article> getAllArticle();
}
