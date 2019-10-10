package com.springbootstarter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootstarter.dto.CourseDto;

@RestController
public class TopicController {
	
	
	@RequestMapping("/courses")
	public List<CourseDto> getAllCourses() {
		CourseDto course=new CourseDto("Java",1,5000.00);
		CourseDto bigData=new CourseDto("BigData",2,10000.00);
		CourseDto angular=new CourseDto("Angular",1,20000.00);
		List<CourseDto> courses=new ArrayList<>();
		courses.add(course);
		courses.add(bigData);
		courses.add(angular);
		return courses;
		
	}

}
