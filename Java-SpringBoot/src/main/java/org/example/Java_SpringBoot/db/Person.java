package org.example.Java_SpringBoot.db;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
     private String name;
     private int id; // Changed from String to int
}
