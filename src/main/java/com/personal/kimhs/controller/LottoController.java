package com.personal.kimhs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LottoController {
	@GetMapping("/lotto")
	public String toLotto() {
		return "lotto";
	}
}
