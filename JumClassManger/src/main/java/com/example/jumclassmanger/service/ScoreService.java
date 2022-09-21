package com.example.jumclassmanger.service;

import com.example.jumclassmanger.bean.Score;
import com.example.jumclassmanger.mapper.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService implements ScoreMapper {
    @Autowired
    ScoreMapper scoreMapper;
    int flag=1;
    @Override
    public int deleteByPrimaryKey(String sno, String cno) {
        try {
            scoreMapper.deleteByPrimaryKey(sno,cno);
        }catch (Exception e){
            return -flag;
        }return flag;
    }

    @Override
    public int insert(Score row) {
        try {
            scoreMapper.insert(row);
        }catch ( Exception e){
            return -flag;
        }return flag;
    }

    @Override
    public Score selectByPrimaryKey(String sno, String cno) {
        return scoreMapper.selectByPrimaryKey(sno,cno);
    }

    @Override
    public List<Score> selectAll() {
        return scoreMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Score row) {
        try {
            scoreMapper.updateByPrimaryKey(row);
        }catch (Exception e){
            return -flag;
        }return flag;
    }
}
