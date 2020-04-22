package com.leeyunbo.biz;

/*
 * �ۼ��� : ������
 * �ۼ��� : 4/19 
 * ���� : �׽�Ʈ ���� Ŭ����
 */

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.leeyunbo.biz.board.BoardService;
import com.leeyunbo.biz.board.BoardVO;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. Spring �����̳� ���� 
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext4.xml");
		
		// 2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� Lookup �Ѵ�. 
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 3. �� ��� �׽�Ʈ 
		BoardVO vo = new BoardVO();
		// vo.setSeq(0); 
		vo.setTitle("�ӽ� ����");
		vo.setWriter("������");
		vo.setContent("�ӽ� ����..........................");
		boardService.insertBoard(vo);
		
		// 4. �� ��� �˻� ��� �׽�Ʈ 
		List<BoardVO> boardList = boardService.getBoardList();
		for (BoardVO board : boardList) {
			System.out.println("---> "+board.toString());
		}
		
		// 5. Spring �����̳� ����
		container.close();
	}

}
