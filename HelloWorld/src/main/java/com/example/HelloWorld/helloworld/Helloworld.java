package com.example.HelloWorld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Helloworld
{
@RequestMapping("/hello")
public String sayHello()
{
	return "Hello World";
}
}
