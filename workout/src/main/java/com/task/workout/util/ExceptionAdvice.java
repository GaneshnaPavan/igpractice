package com.task.workout.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.task.workout.exception.WorkoutNotFoundException;

//@RestControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(value=WorkoutNotFoundException.class)
	public ResponseEntity<String> workoutNotFoundException(WorkoutNotFoundException workoutException){
		return new ResponseEntity<>("Workout Not Found",HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<String> dbconnectionFails(Exception exception){
		return new ResponseEntity<>("Server Error",HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
