package com.arp.entity;

import java.sql.Date;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long marksId;
	private String hindi;
	private String english;
	private String maths;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "studentId", nullable = false)
	private Student student;
	private Date date;

	public Marks(String hindi, String english, String maths, Student student, Date date) {
		this.hindi = hindi;
		this.english = english;
		this.maths = maths;
		this.student = student;
		this.date = date;
	}

	public Marks() {
	}

	public long getMarksId() {
		return marksId;
	}

	public void setMarksId(long marksId) {
		this.marksId = marksId;
	}

	public String getHindi() {
		return hindi;
	}

	public void setHindi(String hindi) {
		this.hindi = hindi;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMaths() {
		return maths;
	}

	public void setMaths(String maths) {
		this.maths = maths;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
