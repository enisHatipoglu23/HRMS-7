package com.example.hrms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employers")
@Service
public class Employer {

			
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name = "user_id")
			private int userId;
			
			@Column(name = "company_name")
			private String companyName;
			
			@Column(name = "website_adress")
			private String websiteAdress;
			
			@Column(name = "email")
			private String email;
			
			@Column(name = "phone_number")
			private String phoneNumber;
			
			@Column(name = "activation")
			private boolean activation = false;
			
			@Column(name = "email_verification")
			private boolean emailVerification;
			
			@Column(name = "password")
			private String password;

			public Employer() {
				super();
			}

			public Employer(int userId, String companyName, String websiteAdress, String email, String phoneNumber,
					boolean activation, boolean emailVerification, String password) {
				super();
				this.userId = userId;
				this.companyName = companyName;
				this.websiteAdress = websiteAdress;
				this.email = email;
				this.phoneNumber = phoneNumber;
				this.activation = activation;
				this.emailVerification = emailVerification;
				this.password = password;
			}

			public int getUserId() {
				return userId;
			}

			public void setUserId(int userId) {
				this.userId = userId;
			}

			public String getCompanyName() {
				return companyName;
			}

			public void setCompanyName(String companyName) {
				this.companyName = companyName;
			}

			public String getWebsiteAdress() {
				return websiteAdress;
			}

			public void setWebsiteAdress(String websiteAdress) {
				this.websiteAdress = websiteAdress;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPhoneNumber() {
				return phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public boolean isActivation() {
				return activation;
			}

			public void setActivation(boolean activation) {
				this.activation = activation;
			}

			public boolean isEmailVerification() {
				return emailVerification;
			}

			public void setEmailVerification(boolean emailVerification) {
				this.emailVerification = emailVerification;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			

			
			
			
			
			
	
}
