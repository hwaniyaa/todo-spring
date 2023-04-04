package com.rlfghks12q.ch07.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rlfghks12q.ch07.dto.TodoDto;

@Mapper
public interface TodoDao {
  int insertTodo(TodoDto todoDto);
  List<TodoDto> getAllTodo(String pickedDate);
  int deleteTodo(int no);
}
