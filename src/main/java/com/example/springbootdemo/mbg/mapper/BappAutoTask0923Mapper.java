package com.example.springbootdemo.mbg.mapper;

import com.example.springbootdemo.mbg.model.BappAutoTask0923;
import com.example.springbootdemo.mbg.model.BappAutoTask0923Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface BappAutoTask0923Mapper {
    int countByExample(BappAutoTask0923Example example);

    int deleteByExample(BappAutoTask0923Example example);

    int insert(BappAutoTask0923 record);

    int insertSelective(BappAutoTask0923 record);

    List<BappAutoTask0923> selectByExample(BappAutoTask0923Example example);

    int updateByExampleSelective(@Param("record") BappAutoTask0923 record, @Param("example") BappAutoTask0923Example example);

    int updateByExample(@Param("record") BappAutoTask0923 record, @Param("example") BappAutoTask0923Example example);
}