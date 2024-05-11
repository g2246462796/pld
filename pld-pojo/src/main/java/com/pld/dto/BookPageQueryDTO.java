package com.pld.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookPageQueryDTO implements Serializable {

    private int page;

    private int pageSize;

    private String name;

}
