package com.in28Min;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28Min.dataApi.TodoService;

public class TodoServiceStub implements TodoService {

	@Override
	public List<String> retriveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}

	

}
