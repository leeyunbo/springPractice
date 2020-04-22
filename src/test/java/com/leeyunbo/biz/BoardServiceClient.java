package com.leeyunbo.biz;

/*
 * 작성자 : 이윤복
 * 작성일 : 4/19 
 * 목적 : 테스트 목적 클래스
 */

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.leeyunbo.biz.board.BoardService;
import com.leeyunbo.biz.board.BoardVO;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. Spring 컨테이너 구동 
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext4.xml");
		
		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup 한다. 
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 3. 글 등록 테스트 
		BoardVO vo = new BoardVO();
		// vo.setSeq(0); 
		vo.setTitle("임시 제목");
		vo.setWriter("이윤복");
		vo.setContent("임시 내용..........................");
		boardService.insertBoard(vo);
		
		// 4. 글 목록 검색 기능 테스트 
		List<BoardVO> boardList = boardService.getBoardList();
		for (BoardVO board : boardList) {
			System.out.println("---> "+board.toString());
		}
		
		// 5. Spring 컨테이너 종료
		container.close();
	}

}
