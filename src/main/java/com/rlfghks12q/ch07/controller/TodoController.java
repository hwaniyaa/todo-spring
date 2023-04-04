package com.rlfghks12q.ch07.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rlfghks12q.ch07.dto.TodoDto;
import com.rlfghks12q.ch07.service.TodoService;

@Controller
public class TodoController {

  @Autowired
  TodoService todoService;
  
  @GetMapping("/")
  public String index(){
    return "/index/index";
  }

  @GetMapping("/list")
  @ResponseBody
  public List<TodoDto> list(String pickedDate){
    List<TodoDto> todoList = todoService.getAllTodo(pickedDate);
    return todoList;
  }

  @PostMapping("/insert")
  @ResponseBody
  public List<TodoDto> insert(TodoDto todoDto){
    int result = todoService.insertTodo(todoDto);
    List<TodoDto> todoList = todoService.getAllTodo(todoDto.getPickedDate());
    return todoList;
  }

  @PostMapping("/delete")
  public ResponseEntity<Map<String, Integer>> delete(TodoDto todoDto){
    int result = todoService.deleteTodo(todoDto.getNo());
    Map<String, Integer> resultMap = new HashMap<>();
    resultMap.put("result", result);
    return ResponseEntity.status(HttpStatus.OK).body(resultMap);
  }

  
}
