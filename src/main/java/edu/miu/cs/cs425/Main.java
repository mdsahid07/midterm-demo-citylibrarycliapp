package edu.miu.cs.cs425;

import edu.miu.cs.cs425.model.Publisher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello and welcome");
        var publishers= List.of(
                new Publisher(101,"A Karim","sales@karim.com","123-4569856"),
                new Publisher(102,"A Baten","sales@baten.com","123-4569856"),
                new Publisher(103,"A Salam","sales@salam.com",null),
                new Publisher(104,"A Kalam","sales@kalam.com",null)
        );
        publishers.forEach(System.out::println);
    }
}
