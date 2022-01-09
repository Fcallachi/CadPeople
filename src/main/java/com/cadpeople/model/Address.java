package com.cadpeople.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@EqualsAndHashCode(of = {"cep", "numberHouse"})
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
public class Address {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private final Long id;

    @Column(name = "cep", length = 8)
    private final String cep;

    @Column(name = "road", length = 25)
    private final String road;

    @Column(name = "number_house", length = 5)
    private final int numberHouse;

    @Column(name = "district", length = 20)
    private final String district;

    @Column(name = "city", length = 20)
    private final String city;

    @Column(name = "state", length = 2)
    private final String state;

    public Address(final String cep, final String road, final int numberHouse, final String district, final String city, final String state) {
        this.id = null;
        this.cep = cep;
        this.road = road;
        this.numberHouse = numberHouse;
        this.district = district;
        this.city = city;
        this.state = state;
    }

}
