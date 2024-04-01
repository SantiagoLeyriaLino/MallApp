package com.mallApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@DiscriminatorValue("NORMAL_USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NormalUser extends UserMall {
    private String register_date;

}
