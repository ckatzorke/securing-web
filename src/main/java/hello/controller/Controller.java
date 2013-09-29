package hello.controller;

import hello.service.ISecureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private ISecureService secureService;

	@RequestMapping("/secure")
	public String secure(Model model) {
		String sec = secureService.secureId();
		model.addAttribute("secure", sec);
		return "secure";
	}
}
