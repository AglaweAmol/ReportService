package com.report.service;

import com.report.payload.InvoiceDTO;

public interface InvoiceService {


    InvoiceDTO createInvoice(InvoiceDTO invoiceDTO);


    InvoiceDTO getInvoiceById(long id);

}
