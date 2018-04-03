package com.lozko.uni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_id_seq")
  private final int id;

  private final String clientName;
  private final int age;
}
