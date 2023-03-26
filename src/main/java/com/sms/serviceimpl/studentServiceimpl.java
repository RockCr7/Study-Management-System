package com.sms.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.entities.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.studentService;

@Service
public class studentServiceimpl implements studentService {
	
	private StudentRepository studentRepository;
	
	public studentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
		
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
