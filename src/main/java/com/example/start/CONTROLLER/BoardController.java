package com.example.start.CONTROLLER;

import com.example.start.domain.Board;
import com.example.start.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController{

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board/new")
    public String createForm() {
        return "board/createBoardForm";
    }

    @PostMapping("/board/new")
    public String create(BoardForm form) {
        Board board = new Board();
        board.setName((form).getName());

        boardService.join(board);

        return "redirect:/";
    }

    @GetMapping(value = "/board/list")
    public String list(Model model) {
        List<Board> board = boardService.findMember();
        model.addAttribute("board", board);
        return "board/boardList";
    }
}
















