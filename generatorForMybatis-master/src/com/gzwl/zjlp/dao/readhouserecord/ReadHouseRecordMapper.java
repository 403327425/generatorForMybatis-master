package com.gzwl.zjlp.dao.readhouserecord;

import com.gzwl.zjlp.pojo.readhouserecord.ReadHouseRecord;
import com.gzwl.zjlp.pojo.readhouserecord.ReadHouseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadHouseRecordMapper {
    int countByExample(ReadHouseRecordExample example);

    int deleteByExample(ReadHouseRecordExample example);

    int deleteByPrimaryKey(String readHouseRecordId);

    int insert(ReadHouseRecord record);

    int insertSelective(ReadHouseRecord record);

    List<ReadHouseRecord> selectByExample(ReadHouseRecordExample example);

    ReadHouseRecord selectByPrimaryKey(String readHouseRecordId);

    int updateByExampleSelective(@Param("record") ReadHouseRecord record, @Param("example") ReadHouseRecordExample example);

    int updateByExample(@Param("record") ReadHouseRecord record, @Param("example") ReadHouseRecordExample example);

    int updateByPrimaryKeySelective(ReadHouseRecord record);

    int updateByPrimaryKey(ReadHouseRecord record);
}