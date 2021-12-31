package com.careerinfotech.usermanagement.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.careerinfotech.usermanagement.entity.TodoTask;

@Service
public class TodoService {
	
	public List<TodoTask> getAllTodo() {
		List<TodoTask> task = new ArrayList<>();
		task.add(new TodoTask(1L, "cricket", "balling practise", new Date(), false));
		task.add(new TodoTask(2L, "Practising coding java ", "learning java with spring boot and angular 7", new Date(), false));
		task.add(new TodoTask(3L, "Work", "going gd lab for working at sanpada ",new Date(), false));
		return task;
	}

}
