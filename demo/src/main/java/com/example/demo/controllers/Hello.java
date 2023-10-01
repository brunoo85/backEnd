package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.HelloService;

@RestController
@RequestMapping("/servidor")
public class Hello {

     @Autowired
     public HelloService helloService;

     @GetMapping("/hello")
     public String helloWorldGet(){
          String ret = String.format("Hello world Gets: %d", helloService.quantidadeGets());
          // esse %d é igual à linguagem C
          return ret;
     }

     @PostMapping("/hello") 
     public String teste(){
          String ret = String.format("Hello world Post: %d", helloService.quantidadePosts());
          return ret;
     }

    @DeleteMapping("/hello") 
    public String teste2(){
          String ret = String.format("Hello world Delete: %d", helloService.quantidadeDeletes());
          return ret;
     }

    @PutMapping("/hello") 
    public String teste3(){
          String ret = String.format("Hello world Put: %d", helloService.quantidadePuts());
          return ret;
     }
}
