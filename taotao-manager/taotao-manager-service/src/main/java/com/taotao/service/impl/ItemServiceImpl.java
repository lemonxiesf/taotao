package com.taotao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/*import com.taotao.mapper.TbItemDescMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.mapper.TbItemParamItemMapper;*/
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.pojo.TbItemParamItem;
/*import com.taotao.service.ItemService;*/

/**
 * 商品管理service
 * <p>Title: ItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2019年6月16日下午10:44:26
 * @version 1.0
 */
@Service
public class ItemServiceImpl {
	@Autowired
	/*private TbItemMapper itemMapper;*/
	
	 /*implements ItemService*/
	
	public ItemServiceImpl() {
		super();
	}



	/*@Override
	public TbItem getItemById(long itemId) {
	//TbItem item = itemMapper.selectByPrimaryKey(itemId);
	//添加查询条件
	TbItemExample example = new TbItemExample();
	Criteria criteria=example.createCriteria();
	criteria.andIdEqualTo(itemId);
	List<TbItem> list = itemMapper.selectByExample(example);
	if (list != null && list.size() > 0) {
		TbItem item = list.get(0);
		return item;
	}
	return null;
	}*/
}
