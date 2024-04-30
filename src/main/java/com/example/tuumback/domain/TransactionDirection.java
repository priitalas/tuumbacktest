package com.example.tuumback.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "transaction_direction")
public class TransactionDirection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('transaction_direction_id_seq'")
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "direction", nullable = false, length = Integer.MAX_VALUE)
    private String direction;

    @Size(max = 255)
    @NotNull
    @Column(name = "descripiton", nullable = false)
    private String descripiton;

}