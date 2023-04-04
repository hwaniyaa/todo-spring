package com.rlfghks12q.ch07.dto;

import lombok.Data;

@Data
public class TodoDto {
  private int no;
  private String todo;
  private int done;
  private String pickedDate;
}
