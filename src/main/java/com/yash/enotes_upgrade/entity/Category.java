package com.yash.enotes_upgrade.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.IdGeneratorType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseAudit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

//    @Embedded
//    private BaseAudit audit;
}
