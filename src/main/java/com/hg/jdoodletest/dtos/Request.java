package com.hg.jdoodletest.dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Request {
	 @JsonProperty("clientId")
	 private String clientId;
	 @JsonProperty("clientSecret")
	 private String clientSecret;
	 @JsonProperty("script")
	 private String script;
	 @JsonProperty("stdin")
	 private String stdin;
	 @JsonProperty("language")
	 private String language;
	 @JsonProperty("versionIndex")
	 private String versionIndex;
	 @JsonProperty("compileOnly")
	 private boolean compileOnly;
}
