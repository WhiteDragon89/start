package com.example.start.repository;

import com.example.start.domain.Board;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {
    Board save(Board board);
    Optional<Board> findById(Long id);
    Optional<Board> findByName(String name);
    List<Board> findAll();
}
