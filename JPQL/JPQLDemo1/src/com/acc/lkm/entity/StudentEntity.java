package com.acc.lkm.entity;

import javax.persistence.*;

@Entity
@Table(name="Student")
@NamedQueries({
@NamedQuery(name="fetch",query="SELECT s from StudentEntity s"),
@NamedQuery(name="delete",query="DELETE from StudentEntity  where STUDENT_ID=2"),
@NamedQuery(name="update",query="UPDATE StudentEntity SET stream='Java' where STUDENT_ID=1")
})
	public class StudentEntity {
	public StudentEntity() {
		super();
	}
    @Id
    @GeneratedValue
	private Integer Student_id;
	private String Student_name;
	private Integer Student_age;
	private String stream;

	public Integer getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(Integer student_id) {
		Student_id = student_id;
	}

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public Integer getStudent_age() {
		return Student_age;
	}

	public void setStudent_age(Integer student_age) {
		Student_age = student_age;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

}
