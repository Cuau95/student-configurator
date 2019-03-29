package com.titulation.student.configurator.domain.service;

import com.titulation.student.configurator.domain.model.ContactStudent;
import com.titulation.student.configurator.domain.repository.ContactStudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactStudentService {
    
    private ContactStudentRepository contactStudentRepository;

    @Autowired
    public ContactStudentService(ContactStudentRepository contactStudentRepository) {
        this.contactStudentRepository = contactStudentRepository;
    }
    
    public List<ContactStudent> getContactStudentById(String idAlumno) {
        return contactStudentRepository.findByIdAlumno(idAlumno);
    }
    
    public ContactStudent saveContactStudent(ContactStudent contactStudent) {
        return contactStudentRepository.save(contactStudent);
    }
    
}
