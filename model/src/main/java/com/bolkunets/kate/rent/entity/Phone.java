package com.bolkunets.kate.rent.entity;

import lombok.EqualsAndHashCode;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phones")
@Setter
@EqualsAndHashCode
public class Phone {
    private Long id;
    private String countryCode;
    private String phone;
    private Boolean isPrimary;
    private PersonalData personalData;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false, nullable = false)
    public Long getId() {
        return id;
    }

    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    @Column(name = "is_primary")
    public Boolean getPrimary() {
        return isPrimary;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_data_id")
    public PersonalData getPersonalData() {
        return personalData;
    }

}
