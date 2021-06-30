package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

@Table(name = "article")
public class Article {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "price")
    private Double price;

    @Column(name = "supplierId;", length = 100)
    private String supplierId;
    ;
    @Column(name = "stock")
    private int stock;
    @Column(name = "publisher")
    private String publisher;

    @Column(name = "type")
    private String type;



}
