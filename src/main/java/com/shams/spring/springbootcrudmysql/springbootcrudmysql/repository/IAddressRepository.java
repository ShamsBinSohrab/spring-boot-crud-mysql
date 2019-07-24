package com.shams.spring.springbootcrudmysql.springbootcrudmysql.repository;

import com.shams.spring.springbootcrudmysql.springbootcrudmysql.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<Address, Long> {
}
