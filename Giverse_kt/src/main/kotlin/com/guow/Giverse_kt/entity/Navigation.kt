package com.guow.Giverse_kt.entity

import java.util.*
import javax.persistence.*


/**
 * @Author BroG
 * @Description : 导航表
 * @Date 下午4:31 2021/1/22
 **/

@Entity
class Navigation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    @Version
    var version: Long = 0

    var title:String = ""
    var description:String  = ""
    var gmtCreated: Date = Date()
    var gmtModified: Date = Date()
    var isDeleted: Int = 0 //1 Yes 0 No
    var deletedDate: Date = Date()
}