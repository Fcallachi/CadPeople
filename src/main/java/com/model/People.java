package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;

@Entity
@Getter
@EqualsAndHashCode(of = {"cpf"})
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
public class People {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private final Long id;

    @Column(name = "name", length = 20)
    private final String name;

    @Column(name = "surname", length = 20)
    private final String surname;

    @Column(name = "cpf", length = 11)
    private final String cpf;

    @Column(name = "data_nasc", length = 20)
    private final SimpleDateFormat dataNasc;

    public People(final String name, final String surname, final String cpf, final SimpleDateFormat dataNasc) {
        this.id = null;
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
}
