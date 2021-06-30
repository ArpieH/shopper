package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "game")

public class Game extends Article{
    @Column(name = "game_publisher", length = 100, unique = true)
    private String gamePublisher;
    @Column(name = "minimum_age")
    private int minimumAge;
    @Enumerated (EnumType.STRING)
    private GameGanre gameGanre;
}
