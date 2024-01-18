package org.example;

import java.time.LocalDate;
import java.util.List;

public class Order {
    Long id;
    String status;
    LocalDate orderDate;
    List<User> products;
}