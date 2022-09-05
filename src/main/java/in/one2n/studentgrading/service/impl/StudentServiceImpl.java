package in.one2n.studentgrading.service.impl;

import java.util.List;

import in.one2n.studentgrading.entity.Student;
import in.one2n.studentgrading.repository.StudentRepository;
import in.one2n.studentgrading.service.StudentService;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class StudentServiceImpl implements StudentService {

  private final Logger logger;

  private final StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
    this.logger = LoggerFactory.getLogger(Student.class);
  }

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  @Override
  public Student getStudentById(Long id) {
    return studentRepository.findById(id).isPresent() ? studentRepository.findById(id).get() : null;
  }

  @Override
  public Student addStudent(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public void deleteById(Long id) {
    studentRepository.deleteById(id);
    logger.info("Deleted student with id " + id);
  }

  @Override
  public Student updateStudent(Student student) {
    return studentRepository.update(student);
  }
}