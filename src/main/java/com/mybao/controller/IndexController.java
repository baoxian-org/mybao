package com.mybao.controller;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mybao.model.user.User;
import com.mybao.service.IndexService;

@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired
	private IndexService indexService;
	
	@RequestMapping(value="loadData.do",produces="application/json;charset=UTF-8")
	public @ResponseBody String LoadData() throws Exception
	{
		try
		{

			if(indexService != null){
				indexService.addUser("lrj", "abc");
			}
				
			User u=new User();

		
			u.setName("招商银行");
			u.setNumber("001");
		
			String json=JSONObject.fromObject(u).toString();
		
//		String s="{\"Name\": \"中国银行\"}";
//		
//		System.out.print(s);
		
		return json;
		}catch(Exception ex)
		{
			throw ex;
		}
		
	}	
}
