package com.vdab.shopper.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Reviews")
@Data
public class Reviews {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "score",  length = 10)
    private Integer score;
    @Column (name = "description",length = 225)
    private String description;

}
