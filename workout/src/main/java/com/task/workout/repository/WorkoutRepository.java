package com.task.workout.repository;

import org.springframework.data.repository.CrudRepository;

import com.task.workout.entity.Workout;

public interface WorkoutRepository extends CrudRepository<Workout,String> {

}
