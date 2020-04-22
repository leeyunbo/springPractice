package com.leeyunbo.biz.board.impl;

/*
 * �ۼ��� : ������
 * �ۼ��� : 4/19 
 * ���� : �Խ��� Service Ŭ����
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.leeyunbo.biz.board.BoardService;
import com.leeyunbo.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired 
	private BoardDAO boardDAO;
	
	@Override
	public void insertBoard(BoardVO vo) {
		//if(vo.getSeq() == 0) {
		//	throw new IllegalArgumentException("0�� ���� ����� �� �����ϴ�.");
		//}
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}

}
