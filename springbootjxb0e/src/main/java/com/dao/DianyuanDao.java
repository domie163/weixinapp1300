package com.dao;

import com.entity.DianyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianyuanVO;
import com.entity.view.DianyuanView;


/**
 * 店员
 * 
 * @author 
 * @email 
 * @date 2022-04-16 17:14:50
 */
public interface DianyuanDao extends BaseMapper<DianyuanEntity> {
	
	List<DianyuanVO> selectListVO(@Param("ew") Wrapper<DianyuanEntity> wrapper);
	
	DianyuanVO selectVO(@Param("ew") Wrapper<DianyuanEntity> wrapper);
	
	List<DianyuanView> selectListView(@Param("ew") Wrapper<DianyuanEntity> wrapper);

	List<DianyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DianyuanEntity> wrapper);
	
	DianyuanView selectView(@Param("ew") Wrapper<DianyuanEntity> wrapper);
	

}
