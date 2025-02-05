package com.example.placement.service;
import com.example.placement.model.Certificate;
import com.example.placement.repository.CertificateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CertificateService {
	@Autowired
    private CertificateRepository certificateRepository;

    public Certificate saveCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    public Certificate getCertificateById(Long id) {
        return certificateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Certificate not found with id " + id));
    }

    public Certificate updateCertificate(Long id, Certificate updatedCertificate) {
        Certificate certificate = getCertificateById(id);
        certificate.setStudentName(updatedCertificate.getStudentName());
        certificate.setCourse(updatedCertificate.getCourse());
        certificate.setIssuedBy(updatedCertificate.getIssuedBy());
        certificate.setIssueDate(updatedCertificate.getIssueDate());
        return certificateRepository.save(certificate);
    }

    public void deleteCertificate(Long id) {
        certificateRepository.deleteById(id);
    }
}
