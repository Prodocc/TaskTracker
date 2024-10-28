package com.project.tasktracker;

import org.springframework.boot.SpringApplication;

public class TestTasktrackerApplication {

	public static void main(String[] args) {
		SpringApplication.from(TasktrackerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
