package com.example.springdata;

import com.example.springdata.bean.Person;
import com.example.springdata.dao.PersonDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataApplicationTests {
  @Autowired
  private PersonDao personDao;

  @Test
  void contextLoads() {
    Person p = new Person();
    p.setName("lisi");
    p.setAge(23);

    personDao.save(p);
  }

}
