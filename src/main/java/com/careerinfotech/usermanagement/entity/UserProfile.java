package com.careerinfotech.usermanagement.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	private String dob;
	private Date date = new Date();
	private String gender;
	private String password;
	private String accountStatus;

	private Long countryId;
	private Long statesId;
	private Long cityId;

	private String createdBy;
	private String updatedBy;
	private LocalDateTime createOn;
	private LocalDateTime updateOn;

	public UserProfile() {
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Long getStatesId() {
		return statesId;
	}

	public void setStatesId(Long statesId) {
		this.statesId = statesId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getCreateOn() {
		return createOn;
	}

	public void setCreateOn(LocalDateTime createOn) {
		this.createOn = createOn;
	}

	public LocalDateTime getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(LocalDateTime updateOn) {
		this.updateOn = updateOn;
	}

	public UserProfile(Long userId, String firstName, String lastName, String email, String phoneNo, String dob,
			Date date, String gender, String password, String accountStatus, Long countryId, Long statesId, Long cityId,
			String createdBy, String updatedBy, LocalDateTime createOn, LocalDateTime updateOn) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.date = date;
		this.gender = gender;
		this.password = password;
		this.accountStatus = accountStatus;
		this.countryId = countryId;
		this.statesId = statesId;
		this.cityId = cityId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createOn = createOn;
		this.updateOn = updateOn;
	}

	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNo=" + phoneNo + ", dob=" + dob + ", date=" + date + ", gender=" + gender
				+ ", password=" + password + ", accountStatus=" + accountStatus + ", countryId=" + countryId
				+ ", statesId=" + statesId + ", cityId=" + cityId + ", createdBy=" + createdBy + ", updatedBy="
				+ updatedBy + ", createOn=" + createOn + ", updateOn=" + updateOn + "]";
	}

	

}
