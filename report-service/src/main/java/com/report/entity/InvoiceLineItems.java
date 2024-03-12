package com.report.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Invoice_line_items")
public class InvoiceLineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ili_id")
    private Long iliId;

    @Column(name="ili_store_product_id")
    private Long iliStoreProductId;

    @Column(name="ili_product_quantity")
    private Long iliProductQuantity;

    @Column(name="ili_per_product_price")
    private Long iliPerProductPrice;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;



}
