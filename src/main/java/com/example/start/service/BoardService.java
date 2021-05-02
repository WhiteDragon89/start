package com.example.start.service;

import com.example.start.domain.Board;
import com.example.start.repository.BoardRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Transactional
public class BoardService {

    private final BoardRepository boardRepository;

    //@Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }


    //회원가입

    public Long join(Board board){
        validateDuplicateMember(board); //중복 회원 검증
        boardRepository.save(board);
        return board.getId();
    }

    private void validateDuplicateMember(Board board) {
        boardRepository.findByName(board.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    public List<Board> findMember() {
        return boardRepository.findAll();
    }

    public Optional<Board> findOne(Long boardID) {
        return boardRepository.findById(boardID);
    }

}

