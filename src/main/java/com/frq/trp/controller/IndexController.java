package com.frq.trp.controller;

import com.frq.trp.model.Article;
import com.frq.trp.service.impl.ArticleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class IndexController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/")
    public PageInfo<Article> index(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return articleService.getAllArticle(page, pageSize);
    }

}
