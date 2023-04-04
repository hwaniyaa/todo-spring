package com.rlfghks12q.ch07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlfghks12q.ch07.dao.TodoDao;
import com.rlfghks12q.ch07.dto.TodoDto;

@Service
public class TodoServiceImpl implements TodoService {
  @Autowired
  TodoDao todoDao;

  @Override
  public int insertTodo(TodoDto todoDto) {
    int result = todoDao.insertTodo(todoDto);
    return result;
  }

  @Override
  public List<TodoDto> getAllTodo(String pickedDate) {
    List<TodoDto> todoList = todoDao.getAllTodo(pickedDate);
    return todoList;
  }

  @Override
  public int deleteTodo(int no) {
    int result = todoDao.deleteTodo(no);
    return result;
  }
  
}
