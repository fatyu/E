package cc.notalk.e.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cc.notalk.e.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("refresh")
    @ResponseBody
    public String refresh(String name) {
        try {
            categoryService.refresh();
        } catch (Exception e) {
            return "refresh data failed:" + e.getMessage();
        }

        return " refresh data success";
    }

}