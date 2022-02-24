package com.example.adminpage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.adminpage.models.State;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    private String description;
    private String details;

    @ManyToOne
    @JoinColumn(name="countryid", insertable=false, updatable=false)
    private com.example.adminpage.models.Country country;
    private Integer countryid;

    @ManyToOne
    @JoinColumn(name="stateid", insertable=false, updatable=false)
    private com.example.adminpage.models.State state;
    private Integer stateid;

    private String city;
    private String address;
}
