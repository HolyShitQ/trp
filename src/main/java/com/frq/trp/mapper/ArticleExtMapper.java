package com.frq.trp.mapper;

import com.frq.trp.model.Article;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleExtMapper {
    @Select("select * from article")
    List<Article> queryAllArticle();
}