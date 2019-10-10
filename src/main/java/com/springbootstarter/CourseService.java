package com.springbootstarter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootstarter.dto.CourseDto;

@Service
public class CourseService {
	
	private List<CourseDto> courses=new ArrayList<>(Arrays.asList(new CourseDto("Java",1,5000.00),new CourseDto("BigData",2,10000.00),new CourseDto("Angular",3,20000.00)));
	
	
	public List<CourseDto> getAllCourses(){
		return courses;
	}
	
	public CourseDto getCourse(Integer id) {
		if(id!=null && courses!=null) {
		return courses.stream().filter(t->t.getCourseId().equals(id)).findFirst().get();
	}
		return null;
	}
	
	public void addCourse(CourseDto courseDto) {
		courses.add(courseDto);
	}
	
	public void updateCourse(CourseDto courseDto, Integer id) {
		for (CourseDto courseDto2 : courses) {
			if(courseDto2.getCourseId()==id) {
				courses.set(id, courseDto);
			}
		}
	}
	
}
