package com.pld.service;

import com.pld.dto.BookDTO;
import com.pld.dto.BookPageQueryDTO;
import com.pld.result.PageResult;


public interface BookService {

    /**
     * 上传书籍
     * @param bookDTO
     */
    public void upload(BookDTO bookDTO);

    /**
     * 书籍分页查询
     *
     * @param bookPageQueryDTO
     * @return
     */
    PageResult pageQuery(BookPageQueryDTO bookPageQueryDTO);

    /**
     * 书籍收藏
     */
    public void star(Long bookID);

    /**
     * 书籍取消收藏
     * @param bookID
     */
    public void unstar(Long bookID);
}
