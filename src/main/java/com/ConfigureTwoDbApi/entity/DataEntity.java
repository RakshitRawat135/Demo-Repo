package com.ConfigureTwoDbApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dataentity")
public class DataEntity {

    @Id
    private Long id;
    private String name;
}
