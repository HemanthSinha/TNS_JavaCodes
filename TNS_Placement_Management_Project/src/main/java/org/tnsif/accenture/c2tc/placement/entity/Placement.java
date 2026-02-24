package org.tnsif.accenture.c2tc.placement.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
import org.tnsif.accenture.c2tc.placement.enums.PlacementStatus;

@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue
    private UUID id;

    private String companyName;
    private String role;

    private BigDecimal packageCtc;
    private BigDecimal eligibilityCgpa;
    private String eligibleBranch;

    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public BigDecimal getPackageCtc() {
		return packageCtc;
	}

	public void setPackageCtc(BigDecimal packageCtc) {
		this.packageCtc = packageCtc;
	}

	public BigDecimal getEligibilityCgpa() {
		return eligibilityCgpa;
	}

	public void setEligibilityCgpa(BigDecimal eligibilityCgpa) {
		this.eligibilityCgpa = eligibilityCgpa;
	}

	public String getEligibleBranch() {
		return eligibleBranch;
	}

	public void setEligibleBranch(String eligibleBranch) {
		this.eligibleBranch = eligibleBranch;
	}

	public LocalDate getLastDate() {
		return lastDate;
	}

	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

	public LocalDate getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(LocalDate scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Integer getEligibleYear() {
		return eligibleYear;
	}

	public void setEligibleYear(Integer eligibleYear) {
		this.eligibleYear = eligibleYear;
	}

	public PlacementStatus getStatus() {
		return status;
	}

	public void setStatus(PlacementStatus status) {
		this.status = status;
	}

	private LocalDate lastDate;
    private LocalDate scheduleDate;
    private String qualification;
    private Integer eligibleYear;

    @Enumerated(EnumType.STRING)
    private PlacementStatus status;

    // Generate getters & setters
}