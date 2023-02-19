package com.bootapp.rest.restapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootapp.rest.restapp.data.AttendanceRepository;
import com.bootapp.rest.restapp.model.Attendance;
@Service
public class AttendanceService {
	@Autowired
	private AttendanceRepository attendanceRepository ;

	public void addAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		attendanceRepository.save(attendance);
		
		
	}

}
