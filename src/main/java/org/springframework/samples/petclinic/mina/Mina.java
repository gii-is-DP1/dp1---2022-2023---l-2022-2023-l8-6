package org.springframework.samples.petclinic.mina;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Range;
import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.samples.petclinic.tablero.Tablero;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Mina extends NamedEntity {
    @Range(min = 0, max = 7)
    int xPosition;
    @Range(min = 0, max = 7)
    int yPosition;

    @ManyToOne
    Tablero tablero;

    public Integer getPositionXInPixels(Integer size){
        return (xPosition) * size;
    }

    public Integer getPositionYInPixels(Integer size){
        return (yPosition) * size;
    }

}
