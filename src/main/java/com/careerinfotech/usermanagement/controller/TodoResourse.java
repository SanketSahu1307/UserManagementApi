package com.careerinfotech.usermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.careerinfotech.usermanagement.entity.TodoTask;
import com.careerinfotech.usermanagement.service.TodoService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class TodoResourse {
	
	@Autowired
	private TodoService serv;
	
	@GetMapping("/todo")
	public List<TodoTask> getTodoTask() {
		return serv.getAllTodo();
	}

}
