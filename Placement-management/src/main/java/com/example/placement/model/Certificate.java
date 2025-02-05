package com.example.placement.model;
import jakarta.persistence.*;
@Entity
@Table(name = "certificates")
public class Certificate {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(nullable = false)
	    private String studentName;
	    
	    @Column(nullable = false)
	    private String course;
	    
	    @Column(nullable = false)
	    private String issuedBy;
	    
	    @Column(nullable = false)
	    private String issueDate;

	    // Constructors
	    public Certificate() {}

	    public Certificate(String studentName, String course, String issuedBy, String issueDate) {
	        this.studentName = studentName;
	        this.course = course;
	        this.issuedBy = issuedBy;
	        this.issueDate = issueDate;
	    }

	    // Getters and Setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getStudentName() { return studentName; }
	    public void setStudentName(String studentName) { this.studentName = studentName; }

	    public String getCourse() { return course; }
	    public void setCourse(String course) { this.course = course; }

	    public String getIssuedBy() { return issuedBy; }
	    public void setIssuedBy(String issuedBy) { this.issuedBy = issuedBy; }

	    public String getIssueDate() { return issueDate; }
	    public void setIssueDate(String issueDate) { this.issueDate = issueDate; }
	}
