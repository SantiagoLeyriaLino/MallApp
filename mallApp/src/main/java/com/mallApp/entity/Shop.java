package com.mallApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Shop")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    private String email;
    private String description;
    private String address;
    private Boolean is_active;
    private Long phone_number;
    @ManyToOne(
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name = "owner_id",
            referencedColumnName = "id"
    )
    private Owner owner_id;
}
