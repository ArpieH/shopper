package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorColumn
@Entity
@Table (name = "book")
public abstract class Book extends Article{

    @Column (name = "auther")
    private String author;

    @Column (name = "isbn")
    private String Isbn;

    @Column (name = "pages")
    private  int pages;
}
