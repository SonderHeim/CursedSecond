package com.cursed.Cursed.models;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    private Long id;
    private Date created;
    private Date updated;
}
