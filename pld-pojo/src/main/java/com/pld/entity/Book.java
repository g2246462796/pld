package com.pld.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

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
    //捐赠时间
    private LocalDateTime donateTime;
    //状态
    private String status;
    //捐赠者id
    private Long donorId;
}
