package com.lanou.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.exception.NameException;
import com.lanou.exception.UserNotExistException;
import com.lanou.model.Admin;
import com.lanou.model.Order;
import com.lanou.service.AdminService;
import com.lanou.service.OrderService;

@Controller
@RequestMapping("/back")
public class BackController {
	@Autowired
	private AdminService admSer;
	@Autowired
	private OrderService ordSer;

	@RequestMapping("/home")
	public String home() {
		return "Background";
	}

	@RequestMapping("/check")
	@ResponseBody
	public Map<String, Object> check(HttpSession session) {
		Admin adm = (Admin) session.getAttribute("admin");
		Map<String, Object> map = new HashMap<String, Object>();
		if (adm == null) {
			map.put("key", "false");

		} else {

			map.put("key", "true");
			map.put("name", adm.getAdmName());
		}
		return map;
	}

	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(Admin adm, HttpSession session) throws UserNotExistException, NameException {
		admSer.login(adm);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", "checked");
		Admin newAdm = admSer.queryAdmin(adm.getAdmAccount());
		session.setAttribute("admin", newAdm);
		return map;
	}

	@RequestMapping(value = "/exit")
	public String exit(String url, HttpSession session) {
		session.removeAttribute("admin");
		return "redirect:" + url;
	}

	@RequestMapping("/tab1")
	@ResponseBody
	public List<Order> work() {
		List<Order> list = ordSer.queryStatus(0);
		return list;
	}
}
