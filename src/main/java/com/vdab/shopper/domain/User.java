package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
     @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @ManyToMany
    Set<Order> orderedArticles;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;


    @Column(name = "username")
    private String username;

    @Column (name = "bill_amount")
    private double Bill_amount;
    @Column(name = "contact")
    private String contact;

}













