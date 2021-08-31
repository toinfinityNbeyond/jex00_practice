package org.zerock.jex00_practice.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.jex00_practice.board.dto.BoardDTO;
import org.zerock.jex00_practice.board.service.BoardService;
import org.zerock.jex00_practice.board.service.TimeService;


@Controller
@RequestMapping("/board/*")
@Log4j2
@RequiredArgsConstructor // 개발 할 때 사용. private final과 함께 사용. 테스트에서는 @AutoWired 사용.
public class BoardController {

    private final TimeService timeService;

    private final BoardService boardService;  //postMapping에서 사용

    @GetMapping("/time")   // TimeMapper 연결하는 역할
    public void getTime(Model model) {
        log.info("===========controller getTime=========");
        model.addAttribute("time", timeService.getNow());
    }

    @PostMapping("/register")
    public String registerPost(BoardDTO boardDTO) { // 리다이렉트 하려고 String사용

        log.info("boardDTOM    " + boardDTO);

        Long bno = boardService.register(boardDTO);

        return "redirect:/board/list";

    }
}
