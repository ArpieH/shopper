package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
    @Column (name = "userName")
    private String userName;
    @Column (name = "userAdress")
    private String userAddress;
    @Column (name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;
@Column (name = "time")
    private Date time;
@Column
private String article;
    @ManyToMany
    Set<User> ordered;

  }



