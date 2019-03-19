package com.lanou.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.exception.NameException;
import com.lanou.exception.UserNotExistException;

@ControllerAdvice
public class ControllerExceptionHandler {
	@ExceptionHandler(NameException.class)
	@ResponseBody
	public Map<String, String> nameException(NameException nameEx) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("identify", "false");
		map.put("message", nameEx.getMessage());
		return map;
	}

	@ExceptionHandler(UserNotExistException.class)
	@ResponseBody
	public Map<String, String> userNotExistException(UserNotExistException uneEx) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("identify", "false");
		map.put("message", uneEx.getMessage());
		return map;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	@ResponseBody
	public Map<String, String> handlerDuplicateKeyException(DuplicateKeyException e) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key", "false");
		map.put("message", "用户名重复");
		return map;
	}

}
