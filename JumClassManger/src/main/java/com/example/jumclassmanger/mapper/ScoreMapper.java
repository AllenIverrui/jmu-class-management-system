package com.example.jumclassmanger.mapper;

import com.example.jumclassmanger.bean.Score;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    int deleteByPrimaryKey(@Param("sno") String sno, @Param("cno") String cno);

    int insert(Score row);

    Score selectByPrimaryKey(@Param("sno") String sno, @Param("cno") String cno);

    List<Score> selectAll();

    int updateByPrimaryKey(Score row);
}