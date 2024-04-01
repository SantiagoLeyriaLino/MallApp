package com.mallApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@DiscriminatorValue("OWNER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends UserMall {
    private String description;
}
