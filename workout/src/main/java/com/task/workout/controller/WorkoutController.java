package com.task.workout.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.workout.dto.WorkoutDto;
import com.task.workout.entity.Workout;
import com.task.workout.exception.WorkoutNotFoundException;
import com.task.workout.service.WorkoutService;

import jakarta.validation.Valid;
@CrossOrigin(origins="*") 
@RestController
//@Validated
public class WorkoutController {
	
	@Autowired
	WorkoutService workoutService;
	
	@Autowired
	ModelMapper modelMapper;
	
	@PostMapping("/workout")
	public ResponseEntity<String> addworkout(@RequestBody @Valid WorkoutDto workoutDto,Errors errors) {
		if(errors.hasErrors()) {
			return new ResponseEntity<>("validation Failed",HttpStatus.BAD_REQUEST);
		}
		Workout workout=modelMapper.map(workoutDto, Workout.class);
		workoutService.addWorkout(workout);
		return new ResponseEntity<>("Added",HttpStatus.CREATED);
	}
	
	@GetMapping("/workoutg")
	public List<WorkoutDto> getAllWorkout(){
		List<Workout> workoutlist=workoutService.getAllWorkout();
		return workoutlist.stream().map(wo->modelMapper.map(wo,WorkoutDto.class)).collect(Collectors.toList());
	}
	
	@GetMapping("/workout/{title}")
	public WorkoutDto getWorkout( @PathVariable("title") String title) throws WorkoutNotFoundException {
		Workout workout=workoutService.getWorkout(title);
		return modelMapper.map(workout, WorkoutDto.class);
		
	}
	

}
