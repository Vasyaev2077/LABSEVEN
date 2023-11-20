package ru.vasyaev.thymeleafwebapplab7.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vasyaev.thymeleafwebapplab7.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer> {
}
