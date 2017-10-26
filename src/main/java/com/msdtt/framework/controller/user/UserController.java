package com.msdtt.framework.controller.user;

import com.msdtt.framework.controller.BaseController;
import com.msdtt.framework.logic.OverdueTestLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhuxd@wjs.com
 * @date 2017/10/16 23:02
 */
@Controller
@RequestMapping("/")
public class UserController extends BaseController{

	@Autowired
	private OverdueTestLogic overdueTestLogic;

	@RequestMapping("login")
	@ResponseBody
	public Object login(){
		overdueTestLogic.test();
		return "你好像登陆成功了";
	}

	@RequestMapping("userInfo")
	@ResponseBody
	public Object userInfo(){
		return "性别男爱好女";
	}
}
