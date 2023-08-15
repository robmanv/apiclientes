package com.vellasques.apiclientes.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @Column(columnDefinition = "CHAR", length = 36)
    private String uuid;

    private String name;

    private String email;

}


