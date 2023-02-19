package com.bootapp.rest.restapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootapp.rest.restapp.model.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

}
