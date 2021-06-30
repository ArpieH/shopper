package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance (strategy = InheritanceType.JOINED)
@EqualsAndHashCode(callSuper = true)
@Table(name = "lp")

public class Lp extends Article{
    @Column (name = "producer", length = 100, unique = true)
    private String producer;

    @Enumerated(EnumType.STRING)
    private LpGanre lpGanre;


}
