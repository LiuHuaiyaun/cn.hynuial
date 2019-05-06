package cn.hynuial.dms.bean.entity;

import java.io.Serializable;

public class UserCourse implements Serializable {
	private static final long serialVersionUID = 1L;
	private User user;
	private Course course;
	private Double score;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
}
