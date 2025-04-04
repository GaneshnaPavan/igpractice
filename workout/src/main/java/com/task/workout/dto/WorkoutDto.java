package com.task.workout.dto;

import jakarta.validation.constraints.NotNull;

public class WorkoutDto {
	@NotNull(message = "no title")
	String title;
	@NotNull(message = "no duration")
	float duration;
	@NotNull(message = "no calories")
	Integer calories;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public WorkoutDto() {
	}
	@Override
	public String toString() {
		return "Workout [title=" + title + ", duration=" + duration + ", calories=" + calories + "]";
	}
	
	
	

}
