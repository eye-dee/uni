package com.lozko.uni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
  private final int id;
  private final int clientId;
  private final int sum;
}
