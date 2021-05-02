package com.example.start.service;

import com.example.start.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;
    private final BoardRepository boardRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository,
                        BoardRepository boardRepository) {
        this.memberRepository = memberRepository;
        this.boardRepository = boardRepository;
    }
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }


    @Bean
    public BoardService boardService(){
        return new BoardService(boardRepository);
    }
    //-----------------------------------------

    //jpa
    //private EntityManager em;

    //@Autowired
    //public SpringConfig(EntityManager em) {
    //    this.em = em;
    //}

    //------------------------------------------

    //jdbc까지
    //private DataSource dataSource;

    //@Autowired
    //public SpringConfig(DataSource dataSource) {
    //    this.dataSource = dataSource;
    //}


//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberRepository());
//    }

    //@Bean
    //public MemberRepository memberRepository(){
        //return  new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        //return new JpaMemberRepository(em);

    //}
}
