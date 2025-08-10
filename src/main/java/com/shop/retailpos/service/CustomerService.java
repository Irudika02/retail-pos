package com.shop.retailpos.service;

import com.shop.retailpos.model.Customer;
import com.shop.retailpos.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> listAll(){
        return customerRepository.findAll();
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public void delete(Long id){
        customerRepository.deleteById(id);
    }

    public Customer get(Long id){
        return customerRepository.findById(id).orElse(null);
    }
}
