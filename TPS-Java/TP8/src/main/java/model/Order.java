package model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Getter
@Setter
@Entity
public class Order {
    @Id
    private long id;
    @Transient
    private double amount;
    @Column(name = "DesColumn")
    private String description;

    public Order(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public Order() {
    }
}
