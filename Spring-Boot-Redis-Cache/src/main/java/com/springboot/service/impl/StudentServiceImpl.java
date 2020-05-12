package com.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.bean.Student;
import com.springboot.mapper.StudentMapper;
import com.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public Student update(Student student) {
		this.studentMapper.update(student);
		return this.studentMapper.queryStudentBySno(student.getSno());
	}

	@Override
	public void deleteStudentBySno(String sno) {
		this.studentMapper.deleteStudentBySno(sno);
	}

	@Override
	public Student queryStudentBySno(String sno) {
		return this.studentMapper.queryStudentBySno(sno);
	}

	/**
	 * 这里是伪代码并没有连接数据库,只是简单做一下测试
	 * @param name
	 * @return
	 */
	@Override
	public String getName(String name) {
		try {
			//这里将线程休眠5s可以通过相应时间直观的感受缓存
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return name;
	}
}
