package com.frq.trp.controller;

import com.frq.trp.model.Article;
import com.frq.trp.service.impl.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class IndexController {

    @Autowired
    ArticleService articleService;

//    @GetMapping("/")
//    public PageInfo<Article> index(@RequestParam(value = "page", defaultValue = "1") Integer page,
//                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
//        return articleService.getAllArticle(page, pageSize);
//    }

    @GetMapping("/")
    public List<Article> index() {
        return articleService.getAllArticle();
    }
}
