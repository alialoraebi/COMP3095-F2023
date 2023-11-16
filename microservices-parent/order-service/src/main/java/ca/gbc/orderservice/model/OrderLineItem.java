package ca.gbc.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "t_order_line_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderLineItem {
    @Id
    private Long id;
    private String skuCode;
    private Integer quantity;
    private BigDecimal price;
}
