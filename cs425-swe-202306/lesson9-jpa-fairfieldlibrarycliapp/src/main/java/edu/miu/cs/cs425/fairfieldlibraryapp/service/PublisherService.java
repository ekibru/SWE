package edu.miu.cs.cs425.fairfieldlibraryapp.service;

import edu.miu.cs.cs425.fairfieldlibraryapp.model.Publisher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PublisherService {
    Publisher addNemPublisher(Publisher newPublisher);
    List<Publisher> getAllPublisher();
    Optional<Publisher> getPublisherById(Integer publisherId);
    Publisher updatePublisher(Publisher publisher);
    void deletPublisher(Integer publisher);
}
