package com.pld.mapper;

import com.github.pagehelper.Page;
import com.pld.dto.BookPageQueryDTO;
import com.pld.entity.Book;
import com.pld.entity.Star;
import com.pld.vo.BookVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {

    /**
     *插入书籍信息
     * @param book
     */
    void insert(Book book);

    /**
     * 书籍查询
     *
     * @param bookPageQueryDTO
     * @return
     */
    Page<BookVO> pageQuery(BookPageQueryDTO bookPageQueryDTO);

    /**
     * 书籍收藏
     * @param star
     */
    void star(Star star);


    /**
     * 书籍取消收藏
     * @param star
     */
    void unstar(Star star);
}
