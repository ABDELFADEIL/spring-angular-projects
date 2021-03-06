package com.simplon.quizz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Quizz implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy="quizz")
    private List<Question> questions = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name="idCategorie")
    private Categorie categorie;
    private int  duration;
    private Difuculte difuculte;

}
