package org.zerock.jex00_practice.board.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board { //읽기전용. getter만 사용

    private Long bno;
    private String title,content, writer;
    private LocalDateTime regDate, modDate;

}
