package com.javawhizz.RestAPI.Entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadService {

    @Autowired
    private LoadRepository loadRepository;

    public List<Load> getAllLoads() {
        return loadRepository.findAll();
    }

    public Optional<Load> getLoadById(Long id) {
        return loadRepository.findById(id);
    }

    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }

    public Load addLoad(Load load) {
        return loadRepository.save(load);
    }

    public Load updateLoad(Long id, Load updatedLoad) {
        updatedLoad.setId(id); // Ensure ID is set for update
        return loadRepository.save(updatedLoad);
    }

    public void deleteLoad(Long id) {
        loadRepository.deleteById(id);
    }
}