package spring.courses.demoCourse.services;

import java.util.List;

import spring.courses.demoCourse.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

}
