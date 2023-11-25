package com.example.apicrud;

import org.springframework.data.repository.CrudRepository;

interface CompanyRepository extends CrudRepository<Company, Long> { }
