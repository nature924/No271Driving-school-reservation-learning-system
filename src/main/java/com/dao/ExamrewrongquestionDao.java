package com.dao;

import com.entity.ExamrewrongquestionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ExamrewrongquestionView;

/**
 * 错题表 Dao 接口
 *
 * @author 
 */
public interface ExamrewrongquestionDao extends BaseMapper<ExamrewrongquestionEntity> {

   List<ExamrewrongquestionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
