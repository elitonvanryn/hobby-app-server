package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.vrsistemas.hobbyapp.server.domain.enums.UserProfile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserApp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	private String email;
	private String password;
	private String token;
	private Boolean sendTokenMail = Boolean.FALSE;
	private Date dateOfToken;
	private Boolean validated = Boolean.FALSE;
	private Date dateOfValidation;
	
	private Integer userProfile;
	
	public UserApp() {
		// TODO Auto-generated constructor stub
	}

	public UserApp(Integer id, String email, String password, String token, Boolean sendTokenMail, Date dateOfToken,
			Boolean validated, Date dateOfValidation) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.token = token;
		this.sendTokenMail = sendTokenMail;
		this.dateOfToken = dateOfToken;
		this.validated = validated;
		this.dateOfValidation = dateOfValidation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getSendTokenMail() {
		return sendTokenMail;
	}

	public void setSendTokenMail(Boolean sendTokenMail) {
		this.sendTokenMail = sendTokenMail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getDateOfToken() {
		return dateOfToken;
	}

	public void setDateOfToken(Date dateOfToken) {
		this.dateOfToken = dateOfToken;
	}

	public Boolean getValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	public Date getDateOfValidation() {
		return dateOfValidation;
	}

	public void setDateOfValidation(Date dateOfValidation) {
		this.dateOfValidation = dateOfValidation;
	}
	
	public UserProfile getUserProfile(Integer id) {
		return UserProfile.toEnum(id);
	}
	
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile.getId();
	}
	
	public static BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
