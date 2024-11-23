package com.yash.enotes_upgrade.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DialectOverride;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Date;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseAudit {
    private Integer createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private boolean isActive;
    private boolean isDeleted;
}
