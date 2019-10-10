package com.springbootstarter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootstarter.dto.CourseDto;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	@RequestMapping("/courses")
	public List<CourseDto> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/course/{id}")
	public CourseDto getCourse(@PathVariable Integer id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/courses")
	public void addCourse(@RequestBody CourseDto courseDto) {
		System.out.println(courseDto.getCourseName());
		courseService.addCourse(courseDto);
	}

}
