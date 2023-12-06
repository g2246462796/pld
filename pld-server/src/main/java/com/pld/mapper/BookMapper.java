package com.pld.mapper;

import com.pld.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {

    /**
     *插入书籍信息
     * @param book
     */
    void insert(Book book);

}
