package com.pld.controller;


import com.pld.dto.BookDTO;
import com.pld.dto.BookPageQueryDTO;
import com.pld.result.PageResult;
import com.pld.result.Result;
import com.pld.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/book")
@Api(tags = "C端-书籍相关接口")
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

    /**
     * 书籍分页查询
     *
     * @param bookPageQueryDTO
     * @return
     */
    @GetMapping("/page")
    @ApiOperation("书籍分页查询")
    public Result<PageResult> page(BookPageQueryDTO bookPageQueryDTO) {
        log.info("书籍分页查询:{}", bookPageQueryDTO);
        PageResult pageResult = bookService.pageQuery(bookPageQueryDTO);//后绪步骤定义
        return Result.success(pageResult);
    }

    /**
     * 书籍收藏
     * @param bookID
     * @return
     */
    @GetMapping("/star")
    @ApiOperation("书籍收藏")
    public Result<Result> star(Long bookID) {
        log.info("书籍收藏:{}", bookID);
        bookService.star(bookID);
        return Result.success();
    }

    /**
     * 书籍取消收藏
     * @param bookID
     * @return
     */
    @DeleteMapping("/unstar")
    @ApiOperation("书籍取消收藏")
    public Result<Result> unstar(Long bookID) {
        log.info("书籍取消收藏:{}", bookID);
        bookService.unstar(bookID);
        return Result.success();
    }

}
