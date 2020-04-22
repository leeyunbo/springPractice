package com.leeyunbo.biz.board;

/*
 * �ۼ��� : ������
 * �ۼ��� : 4/19 
 * ���� : �Խ��� Service �������̽�
 */

import java.util.List;

import com.leeyunbo.biz.board.BoardVO;

public interface BoardService {

	//CRUD �޼ҵ� ���� 
	//�� ��� 
	void insertBoard(BoardVO vo);

	//�� ���� 
	void updateBoard(BoardVO vo);

	//�� ���� 
	void deleteBoard(BoardVO vo);

	//�� �� ��ȸ 
	BoardVO getBoard(BoardVO vo);

	//�� ��� ��ȸ 
	List<BoardVO> getBoardList();

}