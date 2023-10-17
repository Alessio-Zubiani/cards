package com.eazybytes.cards.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super(new StringBuilder("[").append(resourceName).append("] not found with the given input data [")
				.append(fieldName).append("]: [").append(fieldValue).append("]").toString());
	}
	
}
