package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deleteCustomer(UUID id);
}
