package com.hg.jdoodletest.service;

import com.hg.jdoodletest.dtos.Request;
import com.hg.jdoodletest.dtos.Response;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class JdoodleService {

	 private final WebClient webClient;

	 public JdoodleService(WebClient.Builder webClientBuilder) {
		  this.webClient = webClientBuilder.build();
	 }

	 public Response executeCode(Request request) {
		  		  Response response = webClient.post()
					 .uri("https://api.jdoodle.com/v1/execute")
					 .contentType(MediaType.APPLICATION_JSON)
					 .bodyValue(request)
					 .retrieve()
					 .bodyToMono(Response.class)
					 .block();
		  return response;
	 }
}
