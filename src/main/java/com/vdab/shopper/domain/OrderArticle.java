package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderArticle {
    @ManyToMany
    private List <Order> orderArticles;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
