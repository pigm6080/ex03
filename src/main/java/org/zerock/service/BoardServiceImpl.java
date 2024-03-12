package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		log.info("register...."+board);
		
		mapper.insert(board);
	}

	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		log.info("get.." + bno);
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("remove.." + board);
		return mapper.update(board);
	}

	@Override
	public boolean remove(Long bno) {
		log.info("remove" + bno);
		return mapper.delete(bno);
	}

	@Override
	public List<BoardVO> getList() {
		log.info("getList-----");
		return mapper.getList();
	}

}
