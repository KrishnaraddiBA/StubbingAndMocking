package com.in28Min;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28Min.buisness.TodoBuisnessImpl;
import com.in28Min.dataApi.TodoService;

public class FirstStubbingAndMockingTest {

	@Test
	public void test() {
//		TodoService todoService=(TodoService) new TodoServiceStub();
//		TodoService todoService=mock(TodoService.class);
//		List<String> asList = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
		
		List<String> asList = Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
		TodoService todoService = mock(TodoService.class);
		when(todoService.retriveTodos("Spring")).thenReturn(asList);
		TodoBuisnessImpl todoBuisnessImpl=new TodoBuisnessImpl(todoService);
		
		List<String> retrieveTodosRelatedToSpring = todoBuisnessImpl.retrieveTodosRelatedToSpring("Spring");
	
		assertEquals(2,retrieveTodosRelatedToSpring.size());
	}

}
