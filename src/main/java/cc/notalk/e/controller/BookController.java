package cc.notalk.e.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cc.notalk.e.domain.entity.Book;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @RequestMapping("query")
    @ResponseBody
    public Book query(String name) {
        return null;
    }

}