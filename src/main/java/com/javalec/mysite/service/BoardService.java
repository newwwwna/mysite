package com.javalec.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.mysite.dao.BoardDao;
import com.javalec.mysite.vo.BoardVO;

@Service("boardService")
public class BoardService {

	@Autowired
	private BoardDao dao;

	public List<BoardVO> getboardlist() {
		return dao.getboardVOList();
	}

	public BoardVO getBoard(int seq) {
	
		dao.cntplus(seq);
		return dao.getBoard(seq);
	}

	public void write(BoardVO vo) {
		dao.write(vo);
	}

	public List<BoardVO> searchtitle(String keyword) {
		return dao.searchtitle(keyword);
	}

	public List<BoardVO> searchcontent(String keyword) {
		return dao.searchcontent(keyword);
	}


	public void delete(BoardVO vo) {
		dao.delete(vo);
	}

	public void update(BoardVO vo) {
		dao.update(vo);
	}
}
