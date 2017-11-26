/**
 * 
 */
package com.intellectdesign.dao;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * 
 * Entity Class for IdeUser Table
 *
 */
@Entity
@Table(name = "IdeUser")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	@Id
	private int Id;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	@Column(name = "Email")
	private String Email;

	@Column(name = "PinCode")
	private Integer PinCode;

	@Column(name = "BirthDate")
	private Date BirthDate;

	@Column(name = "isActive")
	private boolean isActive;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getPinCode() {
		return PinCode;
	}

	public void setPinCode(Integer pinCode) {
		PinCode = pinCode;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}

	public boolean isActive() {
		return isActive ;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((BirthDate == null) ? 0 : BirthDate.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result
				+ ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result
				+ ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((PinCode == null) ? 0 : PinCode.hashCode());
		result = prime * result + (isActive ? 1231 : 1237);
		return result;
	}
*/
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		if (BirthDate == null) {
			if (other.BirthDate != null)
				return false;
		} else if (!BirthDate.equals(other.BirthDate))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (PinCode == null) {
			if (other.PinCode != null)
				return false;
		} else if (!PinCode.equals(other.PinCode))
			return false;
		if (isActive != other.isActive)
			return false;
		return true;
	}*/

	@Override
	public String toString() {
		return "UserEntity [Id=" + Id + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", Email=" + Email + ", PinCode="
				+ PinCode + ", BirthDate=" + BirthDate + ", isActive="
				+ isActive + "]";
	}
	
	
	
}
