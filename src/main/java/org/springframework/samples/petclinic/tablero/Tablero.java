package org.springframework.samples.petclinic.tablero;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Positive;

import org.springframework.samples.petclinic.mina.Mina;
import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tablero extends NamedEntity {
    String background;
    @Positive
    int width;
    @Positive
    int height;

    public Tablero(){ // Constructor
        this.background = "resources/images/tablero.jpg";
        this.width = 400;
        this.height = 400;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tablero", fetch = FetchType.EAGER)
    List<Mina> minas;
}
