package com.pld.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pld.context.BaseContext;
import com.pld.dto.BookDTO;
import com.pld.dto.BookPageQueryDTO;
import com.pld.entity.Book;
import com.pld.entity.Star;
import com.pld.mapper.BookMapper;
import com.pld.result.PageResult;
import com.pld.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pld.vo.BookVO;
import java.time.LocalDateTime;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public void upload(BookDTO bookDTO) {

        Book book = new Book();
        BeanUtils.copyProperties(bookDTO,book);
        Long userId = BaseContext.getCurrentId();

        book.setDonorId(userId);
        book.setDonateTime(LocalDateTime.now());
        book.setStatus("待审核");

        //向书籍列表插入1条数据
        bookMapper.insert(book);
    }

    public PageResult pageQuery(BookPageQueryDTO bookPageQueryDTO) {
        PageHelper.startPage(bookPageQueryDTO.getPage(), bookPageQueryDTO.getPageSize());
        Page<BookVO> page = bookMapper.pageQuery(bookPageQueryDTO);//后绪步骤实现
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void star(Long bookID) {
        Star star = new Star();
        star.setBookId(bookID);
        Long userId = BaseContext.getCurrentId();
        star.setUserId(userId);

        bookMapper.star(star);
    }

    @Override
    public void unstar(Long bookID) {
        Star star = new Star();
        star.setBookId(bookID);
        Long userId = BaseContext.getCurrentId();
        star.setUserId(userId);

        bookMapper.unstar(star);
    }

}
