package org.comstudy21.myweb.board.service;

import java.util.List;

import org.comstudy21.myweb.board.dao.BoardDao;
import org.comstudy21.myweb.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface BoardService {
	
	
	void insertBoard(BoardVo vo);

	void updateBoard(BoardVo vo);

	void deleteBoard(BoardVo vo);

	BoardVo getBoard(BoardVo vo);

	List<BoardVo> getBoardList();

	void deleteAllBoard();

}