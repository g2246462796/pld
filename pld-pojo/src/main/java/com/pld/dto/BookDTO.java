package com.pld.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookDTO implements Serializable {

    private Long id;
    //书籍名称
    private String name;
    //ISBN
    private String ISBN;
    //学院
    private String college;
    //专业
    private String major;
    //校区
    private String location;
    //描述
    private String desc;
}
