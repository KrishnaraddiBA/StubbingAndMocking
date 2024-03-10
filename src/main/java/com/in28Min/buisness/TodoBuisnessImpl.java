package com.in28Min.buisness;

import java.util.ArrayList;
import java.util.List;

import com.in28Min.dataApi.TodoService;

public class TodoBuisnessImpl {
//simple example for stubbing
	
	private TodoService todoService;
	public TodoBuisnessImpl(TodoService todoService) {
	this.todoService=todoService;
	}
	
	
	
	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> list=new ArrayList<String>();
		List<String> retriveTodos = todoService.retriveTodos(user);
		for (String todo : retriveTodos) {
			if (todo.contains("Spring")) {
				list.add(todo);
			}
		}
		
		return list;
		
	}
}
