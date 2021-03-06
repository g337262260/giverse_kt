package com.guow.Giverse_kt.entity

import java.util.*
import javax.persistence.*

/**
 * @Author BroG
 * @Description : 文章实体类
 * @Date 上午10:51 2021/1/22
 **/
@Entity
class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    @Version
    var version: Long = 0
    var title: String = ""
    var type:Int = 0    //文章分类
    var content: String = ""
    var author: String = ""
    var cover:String = ""
    var follow_up:String = ""
    var gmtCreated: Date = Date()
    var gmtModified: Date = Date()
    var isDeleted: Int = 0 //1 Yes 0 No
    var deletedDate: Date = Date()


    override fun toString(): String {
        return "Article(id=$id, version=$version, title='$title', type=$type, content='$content', author='$author', cover='$cover', follow_up='$follow_up', gmtCreated=$gmtCreated, gmtModified=$gmtModified, isDeleted=$isDeleted, deletedDate=$deletedDate)"
    }


}