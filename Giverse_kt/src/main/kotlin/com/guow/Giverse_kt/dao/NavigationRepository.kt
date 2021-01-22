package com.guow.Giverse_kt.dao

import com.guow.Giverse_kt.entity.Article
import com.guow.Giverse_kt.entity.Navigation
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface NavigationRepository :CrudRepository<Navigation,Long> {

    @Query("SELECT a FROM #{#entityName} a order by a.gmtCreated desc")
    override fun findAll(): MutableList<Navigation>


}