package com.msdtt.framework.controller;

import com.msdtt.framework.constants.SysConstants;
import com.msdtt.framework.controller.base.IntegerEditor;
import com.msdtt.framework.vo.user.OperatorsVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuxd@wjs.com
 * @date 2017/9/26 15:59
 */
public class BaseController{

	private  static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

	public BaseController() {
		super();
	}

	protected HttpSession getSession(){
		return this.getRequest().getSession();
	}

	protected HttpServletRequest getRequest(){
		return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
	}

	protected Map<String, String> successMap() {
		Map<String, String> map = new HashMap<>();
		map.put("success", "true");
		return map;
	}


	@InitBinder
	protected void initBinder(ServletRequestDataBinder bin){
		bin.registerCustomEditor(Integer.class, new IntegerEditor());
	}

	/**
	 * 从 session 中获取当前操作者
	 *
	 * @return
	 * @author liujj
	 * @date 2016年4月18日 下午2:27:37
	 */
	protected OperatorsVo getOperator() {

		OperatorsVo operator = (OperatorsVo) this.getSession().getAttribute(SysConstants.LOGINED);
		return operator;
	}
}
