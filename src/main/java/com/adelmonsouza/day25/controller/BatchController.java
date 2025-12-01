package com.adelmonsouza.day25.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/batch")
public class BatchController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getInfo() {
        return ResponseEntity.ok(Map.of(
            "status", "success",
            "message", "Batch endpoint - Day 25",
            "day", "25"
        ));
    }
}
