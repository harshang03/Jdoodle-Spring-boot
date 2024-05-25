package com.hg.jdoodletest.controller;

import com.hg.jdoodletest.dtos.Request;
import com.hg.jdoodletest.dtos.Response;
import com.hg.jdoodletest.service.JdoodleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdoodleController {

	 private final JdoodleService jdoodleService;

	 public JdoodleController(JdoodleService jdoodleService) {
		  this.jdoodleService = jdoodleService;
	 }

	 @PostMapping
	 public Response test(@RequestBody Request request){
		  return jdoodleService.executeCode(request);
	 }
}
