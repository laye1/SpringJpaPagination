package com.saraya.SpringJpaPagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.SpringJpaPagination.customer.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Long>{

}
