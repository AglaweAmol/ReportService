package com.report.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="invoice_id")
    private long invoiceId;

    @Column(name="invoice_store_id")
    private long invoiceStoreId;

    @Column(name="invoice_customer_id")
    private long invoiceCustomerId;

    @Column(name="invoice_delivery_type_id")
    private long invoiceDeliveryTypeId;


    @Column(name="invoice_discount")
    private Double invoiceDiscount;

    @Column(name="invoice_tax_amount")
    private Double invoiceTaxAmount;

    @Column(name="invoice_total_amount")
    private Double invoiceTotalAmount;

    @Column(name="invoice_total_amount_after_discount")
    private Double invoiceTotalAmountAfterDiscount;

    @Column(name="invoice_payment_type")
    private String invoicePaymentType;


    @Column(name="invoice_date")
    private Date invoiceDate;


    @Column(name="invoice_delivery_date")
    private Date invoiceDeliveryDate;


    @Column(name="invoice_total_product_count")
    private long invoiceTotalProductCount;

    @Column(name="invoice_total_pieces_count")
    private long invoiceTotalPiecesCount;

    @Column(name="invoice_status")
    private String invoiceStatus;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private List<InvoiceLineItems> invoiceLineItems;





}
