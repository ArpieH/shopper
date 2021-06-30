package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@DiscriminatorValue(value = "fiction")
@EqualsAndHashCode(callSuper = true)

public class BookFiction extends Book{
    @Column (name = "description",length = 225)
    private String description;
    @Enumerated(EnumType.STRING)
    private FictionBookGanre fictionBookGanre;



}
