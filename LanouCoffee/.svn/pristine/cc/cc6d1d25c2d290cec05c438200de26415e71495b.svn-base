package com.lanou.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.exception.NameException;
import com.lanou.exception.UserNotExistException;
import com.lanou.model.Customer;
import com.lanou.service.CustomerService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private CustomerService cusSer;

	public CustomerService getCusSer() {
		return cusSer;
	}

	public void setCusSer(CustomerService cusSer) {
		this.cusSer = cusSer;
	}

	@RequestMapping("/home")
	public String login() {
		return "Home";
	}

	@RequestMapping("/login")
	@ResponseBody
	public Map<String, String> verify(Customer cus, HttpSession session) throws UserNotExistException, NameException {
		cusSer.login(cus);
		Map<String, String> map = new HashMap<String, String>();
		map.put("identify", "true");
		session.setAttribute("customer", cus);
		session.setMaxInactiveInterval(300);
		return map;
	}

	@RequestMapping("/check")
	@ResponseBody
	public Map<String, Object> check(HttpSession session) {

		Customer cus = (Customer) session.getAttribute("customer");
		Map<String, Object> map = new HashMap<String, Object>();
		if (cus == null) {
			map.put("user", "none");
			return map;
		} else {
			map.put("user", "checked");
			map.put("customer", cus);
			return map;
		}
	}

	@RequestMapping(value = "/register")
	public String register() {
		return "Register";
	}

	@RequestMapping(value = "/registered")
	@ResponseBody
	public Map<String, Object> registered(Customer cus) {
		cusSer.addCustomer(cus);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", "true");
		return map;
	}

	@RequestMapping(value = "/success")
	public String success() {
		return "Success";
	}

	@RequestMapping(value = "/exit")
	public String exit(String url, HttpSession session) {
		session.removeAttribute("customer");
		return "redirect:" + url;
	}

}
