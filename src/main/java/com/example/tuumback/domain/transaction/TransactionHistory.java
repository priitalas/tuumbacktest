package com.example.tuumback.domain.transaction;

import com.example.tuumback.domain.TransactionDirection;
import com.example.tuumback.domain.account.Account;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "transaction_history")
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('transaction_history_id_seq'")
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @NotNull
    @Column(name = "\"time\"", nullable = false)
    private LocalTime time;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transaction_direction_id", nullable = false)
    private TransactionDirection transactionDirection;

    @Column(name = "transaction_amount")
    private Integer transactionAmount;

}