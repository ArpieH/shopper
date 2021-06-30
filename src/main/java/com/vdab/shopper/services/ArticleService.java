package com.vdab.shopper.services;

import com.vdab.shopper.domain.*;
import com.vdab.shopper.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAll() {
        return articleRepository.findAll();
    }

    public void addBook(Book newBook) {
        articleRepository.addBook(newBook);
    }

    public void addGame(Game newGame) {
        articleRepository.addGame(newGame);
    }

    public void addLp(Lp newLp) {
        articleRepository.addLp(newLp);
    }
}


