package com.example.apicrud.company;

import org.springframework.stereotype.Service;

@Service
public class CompanyDtoMapper {
    CompanyDto map(Company company) {
        CompanyDto dto = new CompanyDto();
        dto.setId(company.getId());
        dto.setName(company.getName());
        dto.setDescription(company.getDescription());
        dto.setCity(company.getCity());
        dto.setEmployees(company.getEmployees());
        dto.setTelephone(company.getTelephone());
        dto.setEmail(company.getEmail());
        return dto;
    }
}
