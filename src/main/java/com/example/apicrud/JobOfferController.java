package com.example.apicrud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class JobOfferController {
    private final JobOfferRepository jobOfferRepository;

    public JobOfferController(JobOfferRepository jobOfferRepository) {
        this.jobOfferRepository = jobOfferRepository;
    }

    @GetMapping("/offers/{id}")
    Optional<JobOffer> getOfferById(@PathVariable Long id) {
        return jobOfferRepository.findById(id);
    }
}
