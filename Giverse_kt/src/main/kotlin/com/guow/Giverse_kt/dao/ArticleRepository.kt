package com.guow.Giverse_kt.dao

import com.guow.Giverse_kt.entity.Article
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface ArticleRepository :CrudRepository<Article,Long> {

    @Query("SELECT a FROM #{#entityName} a order by a.gmtCreated desc")
    override fun findAll(): MutableList<Article>

    @Query(value = "SELECT * FROM blog.article where title like %?1%", nativeQuery = true)
    fun findByTitle(title: String): MutableList<Article>

    @Query("SELECT a FROM #{#entityName} a where a.content like %:content%")
    fun findByContent(@Param("content") content: String): MutableList<Article>

    @Query(value = "SELECT * FROM blog.article  where author = ?1", nativeQuery = true)
    fun findByAuthor(author: String): MutableList<Article>
}