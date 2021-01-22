package com.guow.Giverse_kt.entity

import java.util.*
import javax.persistence.*


/**
 * @Author BroG
 * @Description : 日记实体类
 * @Date 上午10:42 2021/1/22
 **/
@Entity
class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    @Version
    var version: Long = 0
    var title: String = ""
    //分类：待定
    var type:Int = 1
    var content: String = ""
    var author: String = ""
    var cover:String = ""
    var follow_up:String = ""
    var gmtCreated: Date = Date()
    var gmtModified: Date = Date()
    var isDeleted: Int = 0 //1 Yes 0 No
    var deletedDate: Date = Date()
}