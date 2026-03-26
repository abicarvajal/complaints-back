package org.example.domain.interfaces;

import org.example.domain.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComplaintRepository extends JpaRepository<Complaint, Long> {

}
