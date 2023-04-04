package com.rlfghks12q.ch07.service;

import java.util.List;

import com.rlfghks12q.ch07.dto.TodoDto;

public interface TodoService {
  public int insertTodo(TodoDto todoDto);
  public List<TodoDto> getAllTodo(String pickedDate);
  int deleteTodo(int no);
}
