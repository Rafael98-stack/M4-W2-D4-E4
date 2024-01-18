package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class App {
  public static void main(String[] args) {
    Supplier<Integer> integerSupplier = () -> {
      Random rndm = new Random();
      return rndm.nextInt(1, 100);
    };
    Supplier<User> userSupplier = () -> {
      Faker faker = new Faker(Locale.ITALY);
      return new User(faker.lordOfTheRings().character(), faker.name().lastName(), integerSupplier.get(), faker.gameOfThrones().city());
    };
    List<User> users = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      users.add(userSupplier.get());
      System.out.println("La lista di utenti ha " + users.size() + " elementi");
    }
  }
}
