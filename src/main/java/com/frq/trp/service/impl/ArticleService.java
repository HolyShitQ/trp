package com.frq.trp.service.impl;

import com.frq.trp.mapper.ArticleExtMapper;
import com.frq.trp.model.Article;
import com.frq.trp.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    ArticleExtMapper articleExtMapper;

    @Override
    public List<Article> getAllArticle() {
        return articleExtMapper.queryAllArticle();
    }

//    @Override
//    public PageInfo<Article> getAllArticle(Integer page, Integer pageSize) {
//        PageHelper.startPage(page, pageSize);
//        List<Article> articles = articleExtMapper.queryAllArticle();
//        return new PageInfo<>(articles);
//    }
}
