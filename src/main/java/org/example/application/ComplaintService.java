package org.example.application;

import org.example.application.dto.ComplaintDto;
import org.example.domain.entity.Complaint;
import org.example.domain.interfaces.IComplaintRepository;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {
    private final IComplaintRepository repository;

    public ComplaintService(IComplaintRepository repository) {
        this.repository = repository;
    }

    public Complaint createComplaint(ComplaintDto complaintDto) {
        Complaint complaint = new Complaint();
        complaint.setUserId(complaintDto.getUserIdentification());
        complaint.setDetail(complaintDto.getDetail());
        complaint.setComplaint_type(complaintDto.getComplaintType());
        return repository.save(complaint);
    }
}
