package com.studentInformation;
import java.util.ArrayList;
import java.util.List;
public class Student {
	
	private String Sname;
	private int SId;
	private List<String> coursesEnrolled;
	
	public Student(int SId,String Sname) {
		this.SId = SId;
		this.Sname = Sname;
		new ArrayList<>();
	}
	
	public int getSId() {
		return SId;
	}
	
	public String getSname() {
		return Sname;
	}

	public List<String> getcoursesEnrolled(){
		
		return coursesEnrolled;	
		
	}
	
	 public void enrollCourse(String courseId) {
	        if (!coursesEnrolled.contains(courseId)) {
	            coursesEnrolled.add(courseId);
	        }
	    }

	    public void dropCourse(String courseId) {
	        coursesEnrolled.remove(courseId);
	    }
}
