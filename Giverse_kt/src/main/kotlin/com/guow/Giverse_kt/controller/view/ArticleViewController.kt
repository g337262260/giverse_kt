package com.guow.Giverse_kt.controller.view

import com.guow.Giverse_kt.dao.ArticleRepository
import com.guow.Giverse_kt.entity.Article
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

import java.util.*


@Controller
class ArticleViewController{

    @Autowired val articleRepository: ArticleRepository? = null

    @GetMapping("listAllArticle")
    @ResponseBody
    fun listAllArticle(): MutableList<Article>? {
        return articleRepository?.findAll()
    }

    @GetMapping("listAllArticleView")
    fun listAllArticleView(model: Model): ModelAndView {
        model.addAttribute("articles", articleRepository?.findAll())
        return ModelAndView("list")
    }

    @GetMapping("findById")
    @ResponseBody
    fun findById(id: Long): Optional<Article>? {
        return articleRepository?.findById(id)
    }


    @GetMapping("detailArticleView")
    fun detailArticleView(id: Long, model: Model): ModelAndView {
        model.addAttribute("article", articleRepository?.findById(id)?.get())
        return ModelAndView("detailArticleView")
    }

    @GetMapping("findByTitle")
    @ResponseBody
    fun findByTitle(title: String): MutableList<Article>? {
        return articleRepository?.findByTitle(title)
    }


    @GetMapping("findByContent")
    @ResponseBody
    fun findByContent(content: String): MutableList<Article>? {
        return articleRepository?.findByContent(content)
    }


    @GetMapping("findByAuthor")
    @ResponseBody
    fun findByAuthor(author: String): MutableList<Article>? {
        return articleRepository?.findByAuthor(author)
    }

    @PostMapping("saveArticle")
    @ResponseBody
    fun saveArticle(article: Article): Article? {
        article.gmtCreated = Date()
        article.gmtModified = Date()
        article.version = 0
        return articleRepository?.save(article)
    }


}