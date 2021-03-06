package com.springboot.racemanage.service.serviceImpl;

import com.springboot.racemanage.service.StudentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.springboot.racemanage.po.Student;
import com.springboot.racemanage.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao studentDao;

    public int insert(Student pojo){
        return studentDao.insert(pojo);
    }

    public int insertSelective(Student pojo){
        return studentDao.insertSelective(pojo);
    }

    public int insertList(List<Student> pojos){
        return studentDao.insertList(pojos);
    }

    public int update(Student pojo){
        return studentDao.update(pojo);
    }
}
