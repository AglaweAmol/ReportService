package com.report.service.Impl;


import com.report.entity.Invoice;
import com.report.exception.ResourceNotFoundException;
import com.report.payload.InvoiceDTO;
import com.report.repository.InvoiceRepository;
import com.report.service.InvoiceService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

private InvoiceRepository invoiceRepository;


private ModelMapper mapper;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository, ModelMapper mapper) {
        this.invoiceRepository = invoiceRepository;
        this.mapper = mapper;
    }

    @Override
    public InvoiceDTO createInvoice(InvoiceDTO invoiceDTO) {
        // convert DTO to entity
        Invoice invoice=mapToEntity(invoiceDTO);
        Invoice newInvoice=invoiceRepository.save(invoice);

        // convert entity to DTO
        InvoiceDTO invoiceResponse=mapToDTO(newInvoice);
        return  invoiceResponse;

    }

    @Override
    public InvoiceDTO getInvoiceById(long id) {

        Invoice invoice=invoiceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Invoice", "id", id));

        return mapToDTO(invoice);
    }


    private InvoiceDTO mapToDTO(Invoice invoice)
    {

        InvoiceDTO invoiceDTO=mapper.map(invoice,InvoiceDTO.class);
          return invoiceDTO;
    }

    private Invoice mapToEntity(InvoiceDTO invoiceDTO)
    {
     Invoice invoice=mapper.map(invoiceDTO,Invoice.class);

     return invoice;
    }
}
