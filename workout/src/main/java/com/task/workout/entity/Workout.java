package com.task.workout.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="workk")
public class Workout {
	@Id
	@Column(name="title")
	String title;
	
	@Column(name="duration")
	float duration;
	
	@Column(name="calories")
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

	public Workout() {
		
	}

	@Override
	public String toString() {
		return "Workout [title=" + title + ", duration=" + duration + ", calories=" + calories + "]";
	}
	
	
	
	

}
