package com.example.placement.controller;
import com.example.placement.model.Certificate;
import com.example.placement.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/certificates")

public class CertificateController {
	 @Autowired
	    private CertificateService certificateService;

	    @PostMapping
	    public Certificate addCertificate(@RequestBody Certificate certificate) {
	        return certificateService.saveCertificate(certificate);
	    }

	    @GetMapping
	    public List<Certificate> getAllCertificates() {
	        return certificateService.getAllCertificates();
	    }

	    @GetMapping("/{id}")
	    public Certificate getCertificateById(@PathVariable Long id) {
	        return certificateService.getCertificateById(id);
	    }

	    @PutMapping("/{id}")
	    public Certificate updateCertificate(@PathVariable Long id, @RequestBody Certificate certificate) {
	        return certificateService.updateCertificate(id, certificate);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteCertificate(@PathVariable Long id) {
	        certificateService.deleteCertificate(id);
	        return "Certificate deleted successfully";
	    }
	}

