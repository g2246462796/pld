package com.pld.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //微信用户唯一标识
    private String openid;

    //姓名
    private String userName;

    //头像
    private String avatar;

    //学院
    private String college;

    //专业
    private String major;

    //身份
    private String identity;

    //积分
    private Long points;

    //注册时间
    private LocalDateTime createTime;
}
