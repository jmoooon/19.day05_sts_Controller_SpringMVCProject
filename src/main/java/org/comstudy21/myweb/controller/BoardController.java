package org.comstudy21.myweb.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.comstudy21.myweb.board.service.BoardServiceImpl;
import org.comstudy21.myweb.board.vo.BoardVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	@Qualifier("boardService")
	private BoardServiceImpl boardService;
	
	
	@RequestMapping("/list")
	public ModelAndView boardList(){
		ModelAndView modelAndView = new ModelAndView("board/board_list");
		List<BoardVo> boardList = boardService.getBoardList();
		
		modelAndView.addObject("boardList", boardList);
		
		//여기서 dao를 불러서 modelandview에 넘겨주면 된다.
		
		return modelAndView;
	}
		
}
