package com.vdab.shopper.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Entity
@NoArgsConstructor
@DiscriminatorValue(value = "nonfiction")
@EqualsAndHashCode(callSuper = true)
public class BookNonFiction extends Book{
 @Enumerated(EnumType.STRING)
 private NonFictionGanre nonFictionGanre;

}
