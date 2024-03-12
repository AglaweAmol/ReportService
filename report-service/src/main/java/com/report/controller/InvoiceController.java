package com.report.controller;

import com.report.payload.InvoiceDTO;
import com.report.service.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/invoice")
public class InvoiceController {


    private InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }



    @PostMapping
    public ResponseEntity<InvoiceDTO> createInvoice(@RequestBody InvoiceDTO invoiceDTO)
    {
        return new ResponseEntity<>(invoiceService.createInvoice(invoiceDTO),HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<InvoiceDTO> getInvoiceByID(@PathVariable(name="id") long id)
      {
          return ResponseEntity.ok(invoiceService.getInvoiceById(id));
      }


}
