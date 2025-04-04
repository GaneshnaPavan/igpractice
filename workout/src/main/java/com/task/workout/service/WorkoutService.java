package com.task.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.workout.entity.Workout;
import com.task.workout.exception.WorkoutNotFoundException;
import com.task.workout.repository.WorkoutRepository;

@Service
@Transactional
public class WorkoutService {
	
	@Autowired
	WorkoutRepository workoutRepository;
	
	public void addWorkout(Workout workout) {
		workoutRepository.save(workout);	
	}
	
	public List<Workout> getAllWorkout(){
		return (List<Workout>) workoutRepository.findAll();
	}
	
	public Workout getWorkout(String title) throws WorkoutNotFoundException {
		Workout workout=workoutRepository.findById(title).orElseThrow(()->new WorkoutNotFoundException());
		return workout;
	}
	

}
