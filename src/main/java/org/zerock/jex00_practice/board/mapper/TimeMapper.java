package org.zerock.jex00_practice.board.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper { // DB에서 가져옴(DAO 비슷한 역할), DB연결

    @Select("select now()")
    String getTime();

    String getTime2();
}
