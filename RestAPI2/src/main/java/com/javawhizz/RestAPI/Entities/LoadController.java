package com.javawhizz.RestAPI.Entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loads")
public class LoadController {

    @Autowired
    private LoadService loadService;

    @GetMapping
    public ResponseEntity<List<Load>> getAllLoads() {
        List<Load> loads = loadService.getAllLoads();
        return ResponseEntity.ok(loads);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<Load> getLoadById(@PathVariable Long loadId) {
        Optional<Load> load = loadService.getLoadById(loadId);
        return load.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping(params = "shipperId")
    public ResponseEntity<List<Load>> getLoadsByShipperId(@RequestParam String shipperId) {
        List<Load> loads = loadService.getLoadsByShipperId(shipperId);
        return ResponseEntity.ok(loads);
    }

    @PostMapping
    public ResponseEntity<Load> addLoad(@RequestBody Load load) {
        Load addedLoad = loadService.addLoad(load);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedLoad);
    }

    @PutMapping("/{loadId}")
    public ResponseEntity<Load> updateLoad(@PathVariable Long loadId, @RequestBody Load updatedLoad) {
        Load load = loadService.updateLoad(loadId, updatedLoad);
        return ResponseEntity.ok(load);
    }

    @DeleteMapping("/{loadId}")
    public ResponseEntity<Void> deleteLoad(@PathVariable Long loadId) {
        loadService.deleteLoad(loadId);
        return ResponseEntity.noContent().build();
    }
}
