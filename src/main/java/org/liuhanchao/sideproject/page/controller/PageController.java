/**
* Copyright 2019 anxinyiheng.com Inc. All Rights Reserved. 
* @Title PageController.java
* @Package org.liuhanchao.sideproject.page.controller
* @Description: TODO:
* @author chao
* @date 2019年5月29日下午4:04:31
* @version V1.0
*/
package org.liuhanchao.sideproject.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title PageController.java
 * @Package org.liuhanchao.sideproject.page.controller
 * @Description: TODO:
 * @author chao
 * @date 2019年5月29日下午4:04:31
 * @version V1.0
 */
@Controller
@RequestMapping("/page")
public class PageController {
	/**
	 * 跳转到主页
	 * @Descrption
	 * @author chao
	 * @date 2019年5月30日下午3:27:37
	 * @return
	 */
	@RequestMapping("/editpass")
	public String jumpIndex(){
		return "editpass";
	}

}
