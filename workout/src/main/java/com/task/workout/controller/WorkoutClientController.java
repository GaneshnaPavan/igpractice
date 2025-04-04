package com.task.workout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.task.workout.dto.WorkoutDto;
import com.task.workout.entity.Workout;

@RestController
public class WorkoutClientController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/client")
	public List<WorkoutDto> consume(){
		ResponseEntity<List<WorkoutDto>> resourceList=restTemplate.exchange("http://localhost:8080/workout",HttpMethod.GET,null,new ParameterizedTypeReference<List<WorkoutDto>>(){});
	return resourceList.getBody().stream().toList();
	}
	
//	@PostMapping("/client")
//	public ResponseEntity<String> consume1(@RequestBody WorkoutDto workoutdto) {
//		
//		restTemplate.postForEntity("http://localhost:8080/workout",workoutdto, Workout.class);
//		return new ResponseEntity<>("Added",HttpStatus.CREATED);
//	}
	@GetMapping("/client/{title}")
	public WorkoutDto consume2(@PathVariable("title") String title) {
		ResponseEntity<WorkoutDto> resource=restTemplate.getForEntity("http://localhost:8080/workout/"+title, WorkoutDto.class);
		return resource.getBody();
		
	}
	
}

//@GetMapping("/client/{id}")
//public String consume(@PathVariable("id")Integer id) {
//	ResponseEntity<Course> resource=restTemplate.getForEntity("http://localhost:8083/course/"+id,Course.class);
//	return resource.getBody().toString();
//}
//@GetMapping("/course/{id}")
//public CourseDto getCourse(@PathVariable("id") Integer id) throws CourseNotFoundException {
//	Course course=courseService.getCourse(id);
//	return modelMapper.map(course,CourseDto.class);
//	
//}