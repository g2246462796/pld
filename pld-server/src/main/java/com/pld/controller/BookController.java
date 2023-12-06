package com.pld.controller;


import com.pld.dto.BookDTO;
import com.pld.result.Result;
import com.pld.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/book")
@Api(tags = "书籍相关接口")
@Slf4j
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    @ApiOperation("上传书籍")
    public Result upload(@RequestBody BookDTO bookDTO) {
        log.info("上传书籍：{}", bookDTO);
        bookService.upload(bookDTO);
        return Result.success();
    }




}
