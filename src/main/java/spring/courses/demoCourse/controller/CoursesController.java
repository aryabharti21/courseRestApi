package spring.courses.demoCourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.courses.demoCourse.entity.Course;
import spring.courses.demoCourse.services.CourseService;

//REST --> representational state transfer
@RestController
public class CoursesController {

	@Autowired
	public CourseService courseService;

	@GetMapping("/home")
	public String home() {

		return "Welcome Home";
	}

	// get courses

	@GetMapping("/course")
	public List<Course> getCourses() {

		return this.courseService.getCourses();

	}

	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {

		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {

		return this.courseService.addCourse(course);
	}

}
