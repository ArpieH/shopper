package com.vdab.shopper.controller;

import com.vdab.shopper.domain.Article;
import com.vdab.shopper.domain.Order;
import com.vdab.shopper.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ApplicationController {
    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "/index")
    public String showIndex(Model model) {
        model.addAttribute("allArticles", articleService.getAll());
        return "index";
    }
    @GetMapping(value = "add_items")
    public String addArticlePage(Model model) {
        List<Order> articleOrder = new ArrayList<>();
        articleOrder.add(Order.builder().article("Book").quantity(1).build());
        articleOrder.add(Order.builder().article("Lp").quantity(2).build());
        articleOrder.add(Order.builder().article("Game").quantity(3).build());
        model.addAttribute("articleOrder", articleOrder);
        model.addAttribute("newArticle", new Article());
        return "addingArticle";
    }

}
