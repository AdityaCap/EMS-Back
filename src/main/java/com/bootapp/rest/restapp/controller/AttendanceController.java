package com.bootapp.rest.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootapp.rest.restapp.model.Attendance;
import com.bootapp.rest.restapp.service.AttendanceService;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
	@Autowired
	private AttendanceService attendanceService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addAttendance(@RequestBody Attendance attendance){
		
		attendanceService.addAttendance(attendance);
		return ResponseEntity.status(HttpStatus.OK).body("Attendance Added");
	}
	   
}