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
public class Star implements Serializable {

    private Long id;
    //书籍名称
    private Long bookId;
    //捐赠者id
    private Long userId;
}

