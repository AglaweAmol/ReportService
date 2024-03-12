package com.report.payload;


import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Data
public class InvoiceDTO {


    private long invoiceId;

    private long invoiceStoreId;

    private long invoiceCustomerId;

    private long invoiceDeliveryTypeId;


    private Double invoiceDiscount;

    private Double invoiceTaxAmount;

    private Double invoiceTotalAmount;

    private Double invoiceTotalAmountAfterDiscount;

    private String invoicePaymentType;


    private Date invoiceDate;


    private Date invoiceDeliveryDate;


    private long invoiceTotalProductCount;

    private long invoiceTotalPiecesCount;

    private String invoiceStatus;

    private List<InvoiceLineItemDTO> invoiceLineItems;
}
