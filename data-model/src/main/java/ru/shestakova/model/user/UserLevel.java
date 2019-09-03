package ru.shestakova.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;

@Entity
@Table
@Data @Wither @FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor @AllArgsConstructor
public class UserLevel {

  @Id @GeneratedValue
  @Column(name = "LevelNum", nullable = false, updatable = false)
  Short levelNum;

  @Column(name = "Name", nullable = false)
  String name;

  @Column(name = "Description")
  String description;
}
