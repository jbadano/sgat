package cl.usach.rcordova.service;

import cl.usach.rcordova.model.StudentInterface;

public interface StudentService {
	StudentInterface save(StudentInterface student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
