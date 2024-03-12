package com.report.payload;

import jakarta.persistence.Column;
import lombok.Data;


@Data
public class InvoiceLineItemDTO {

    private Long iliId;

    private Long iliStoreProductId;

    private Long iliProductQuantity;

    private Long iliPerProductPrice;

    private Long iliInvoiceId;

}
