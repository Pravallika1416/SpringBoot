package org.example.Java_SpringBoot.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Person {
     private String name;
     private int id; // Changed from String to int
}
