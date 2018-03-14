package com.phpbae.jpa_demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Church{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int churchCode;
    private String churchName;
    private String domain;
    private String publicTelNumber;
    private String manageName;
}
