package com.boot.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/poc")
@Api(value = "POC api resource value .", description = "POC api resource description.")
public class PocController {

	@ApiOperation(value = "POC api for display records.")
	@ApiResponses(value = { @ApiResponse(code = 100, message = "Api return status code : 100"),
			@ApiResponse(code = 200, message = "Api return status code : 200"),
			@ApiResponse(code = 404, message = "Api return status code : 404") })
	@GetMapping("/api")
	public String displayApi() {
		return "display data successfully.";
	}

	@PostMapping("/api")
	@ApiOperation(value = "POC api for save records.")
	public String saveApi(@RequestBody final String param) {
		return "Save data successfully.";
	}

	@PutMapping("/api")
	@ApiOperation(value = "POC api for update records.")
	public String updateApi(@RequestBody final String param) {
		return "Data successfully updated .";
	}
}