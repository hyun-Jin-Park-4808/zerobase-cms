package com.zerobase.cms.user.domain.repository;

import com.zerobase.cms.user.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
