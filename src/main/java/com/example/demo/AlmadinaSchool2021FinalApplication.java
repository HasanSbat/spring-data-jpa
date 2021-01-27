package com.example.demo;

import com.example.demo.model.Parent;
import com.example.demo.model.Post;
import com.example.demo.repository.ParentRepository;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.TeacherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AlmadinaSchool2021FinalApplication {

	public static void main(String[] args) throws Throwable {
	ApplicationContext ctx=  SpringApplication.run(AlmadinaSchool2021FinalApplication.class,args);
		PostRepository postRepository = ctx.getBean(PostRepository.class);
		postRepository.save(new Post());

		ParentRepository parentRepository = ctx.getBean(ParentRepository.class);
		parentRepository.save(new Parent());

	}

}
