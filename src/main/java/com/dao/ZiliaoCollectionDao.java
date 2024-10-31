package com.dao;

import com.entity.ZiliaoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiliaoCollectionView;

/**
 * 学习资料收藏 Dao 接口
 *
 * @author 
 */
public interface ZiliaoCollectionDao extends BaseMapper<ZiliaoCollectionEntity> {

   List<ZiliaoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
