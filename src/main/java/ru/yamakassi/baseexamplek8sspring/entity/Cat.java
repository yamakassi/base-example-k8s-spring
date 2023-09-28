package ru.yamakassi.baseexamplek8sspring.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Accessors(chain = true)
public class Cat {

    @Id
    private String id;
    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;
}

