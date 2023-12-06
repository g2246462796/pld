package com.pld.service;

import com.pld.dto.BookDTO;


public interface BookService {

    /**
     * 上传书籍
     * @param bookDTO
     */
    public void upload(BookDTO bookDTO);
}
