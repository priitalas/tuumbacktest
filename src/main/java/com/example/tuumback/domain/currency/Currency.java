package com.example.tuumback.domain.currency;

import com.example.tuumback.domain.account.Account;
import com.example.tuumback.domain.customer.Customer;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "currencies")
public class Currency {
    @Id
    @ColumnDefault("nextval('currencies_id_seq'")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "currency", nullable = false)
    private String currency;

    @OneToMany(mappedBy = "currencies")
    private Set<Account> accounts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "currencies")
    private Set<Customer> customers = new LinkedHashSet<>();

}