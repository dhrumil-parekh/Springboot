package com.codingsample.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	// /courses
	//course: id, name, author
	
	@RequestMapping("/courses")            //used to map_url "/courses"
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Physics", "H.C.Verma"),
				new Course(2, "Chemistry", "John. W")
				
				);
	}
}
