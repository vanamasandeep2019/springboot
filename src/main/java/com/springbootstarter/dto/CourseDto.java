package com.springbootstarter.dto;

public class CourseDto {
	
	private String courseName;
	
    private Integer courseId;
	
	private Double coursePrice;
	
	public CourseDto() {
		
	}
	
	public CourseDto(String courseName,Integer courseId,Double coursePrice){
		this.courseName=courseName;
		this.courseId=courseId;
		this.coursePrice=coursePrice;
		
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Double coursePrice) {
		this.coursePrice = coursePrice;
	}

	
	
	

}
