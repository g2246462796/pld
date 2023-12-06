package com.pld.service.impl;

import com.pld.context.BaseContext;
import com.pld.dto.BookDTO;
import com.pld.entity.Book;
import com.pld.mapper.BookMapper;
import com.pld.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
