package com.lozko.uni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {

  @Id
  @SequenceGenerator(name="pk_sequence",sequenceName="client_id_seq", allocationSize=1)
  @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
  private int id;

  private String clientName;
  private int age;
}
