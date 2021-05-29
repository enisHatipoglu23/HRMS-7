package com.example.hrms.entities;

import java.sql.Date;

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
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seekers")
@EnableSwagger2
@Service
public class JobSeeker {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private int userId;
		
		@Column(name = "first_name")
		private String firstName;
		
		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "nationality_number")
		private String nationalityNumber;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "birth_date")
		private Date birthDate;

		public JobSeeker() {
			super();
		}

		public JobSeeker(int userId, String firstName, String lastName, String nationalityNumber, String email,
				Date birthDate) {
			super();
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationalityNumber = nationalityNumber;
			this.email = email;
			this.birthDate = birthDate;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
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

		public String getNationalityNumber() {
			return nationalityNumber;
		}

		public void setNationalityNumber(String nationalityNumber) {
			this.nationalityNumber = nationalityNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}

	
		
	
}
