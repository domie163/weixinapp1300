package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DianyuanDao;
import com.entity.DianyuanEntity;
import com.service.DianyuanService;
import com.entity.vo.DianyuanVO;
import com.entity.view.DianyuanView;

@Service("dianyuanService")
public class DianyuanServiceImpl extends ServiceImpl<DianyuanDao, DianyuanEntity> implements DianyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianyuanEntity> page = this.selectPage(
                new Query<DianyuanEntity>(params).getPage(),
                new EntityWrapper<DianyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianyuanEntity> wrapper) {
		  Page<DianyuanView> page =new Query<DianyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianyuanVO> selectListVO(Wrapper<DianyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianyuanVO selectVO(Wrapper<DianyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianyuanView> selectListView(Wrapper<DianyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianyuanView selectView(Wrapper<DianyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
