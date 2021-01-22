package com.guow.Giverse_kt

import com.guow.Giverse_kt.dao.ArticleRepository
import com.guow.Giverse_kt.dao.NavigationRepository
import com.guow.Giverse_kt.entity.Article
import com.guow.Giverse_kt.entity.Navigation
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class GiverseKtApplication{

//	@Bean
//	fun init(repository: ArticleRepository) = CommandLineRunner {
//		val article: Article = Article()
//		article.author = "Kotlin"
//		article.title = "极简Kotlin教程 ${Date()}"
//		article.content = "Easy Kotlin ${Date()}"
//		repository.save(article)
//	}

}

fun main(args: Array<String>) {
	runApplication<GiverseKtApplication>(*args)
}
