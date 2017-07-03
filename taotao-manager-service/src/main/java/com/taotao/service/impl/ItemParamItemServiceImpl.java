package com.taotao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.utils.JsonUtils;
import com.taotao.mapper.ItemParamItemMapper;
import com.taotao.pojo.ItemParamItem;
import com.taotao.pojo.ItemParamItemExample;
import com.taotao.pojo.ItemParamItemExample.Criteria;
import com.taotao.service.ItemParamItemService;

@Service
public class ItemParamItemServiceImpl implements ItemParamItemService{

	@Autowired
	private ItemParamItemMapper itemParamItemMapper;
	
	@Override
	public String getItemParamItemByItemId(Long itemid) {
		// 查询规格参数
		ItemParamItemExample example = new ItemParamItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(itemid);
		List<ItemParamItem> list = itemParamItemMapper.selectByExampleWithBLOBs(example);
		if(list == null || list.size() == 0){
			return "";
		}
		// 获取规格参数
		ItemParamItem itemParamItem = list.get(0);
		String paramData = itemParamItem.getParamData();
		// 生成html
		// 将规格参数json数据转化为java对象
		List<Map> jsonList = JsonUtils.jsonToList(paramData, Map.class);
		StringBuffer sb = new StringBuffer();
		sb.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"0\" class=\"Ptable\">\n");
		sb.append("    <tbody>\n");
		for(Map m1 : jsonList) {
			sb.append("        <tr>\n");
			sb.append("            <th class=\"tdTitle\" colspan=\"2\">"+m1.get("group")+"</th>\n");
			sb.append("        </tr>\n");
			List<Map> list2 = (List<Map>) m1.get("params");
			for(Map m2:list2) {
				sb.append("        <tr>\n");
				sb.append("            <td class=\"tdTitle\">"+m2.get("k")+"</td>\n");
				sb.append("            <td>"+m2.get("v")+"</td>\n");
				sb.append("        </tr>\n");
			}
		}
		sb.append("    </tbody>\n");
		sb.append("</table>");
		return sb.toString();

	}

}
