package org.example.application;

import org.example.application.dto.ComplaintDto;
import org.example.domain.entity.Complaint;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {
    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @PostMapping
    public ResponseEntity<Complaint> createCompliant(@RequestBody ComplaintDto complaintDto) {
        Complaint createdComplaint = complaintService.createComplaint(complaintDto);
        return ResponseEntity.ok(createdComplaint);
    }
}
