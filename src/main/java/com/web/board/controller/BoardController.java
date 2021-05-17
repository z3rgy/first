package com.web.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	//.do 및 다른 도매인 필요 x /list 만 작성해도됨
	@GetMapping("/list.do")
	//실행할 메소드 만들기
	public String list() {
		System.out.println("BoardController.list()");
		//prefix- /WEB-INF/views/
		//suffix- .jsp
		return "board/list";
	}
}
