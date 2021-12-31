package com.careerinfotech.usermanagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class TodoTask {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String Task;
	private String description;
	private Date date;
	private boolean done;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTask() {
		return Task;
	}

	public void setTask(String task) {
		Task = task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public TodoTask(Long id, String task, String description, Date date, boolean done) {
		super();
		Id = id;
		Task = task;
		this.description = description;
		this.date = date;
		this.done = done;
	}

	@Override
	public String toString() {
		return "TodoTask [Id=" + Id + ", Task=" + Task + ", description=" + description + ", date=" + date + ", done="
				+ done + "]";
	}
	
	

}
