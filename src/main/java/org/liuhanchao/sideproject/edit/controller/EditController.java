/**
* Copyright 2019 anxinyiheng.com Inc. All Rights Reserved. 
* @Title EditController.java
* @Package org.liuhanchao.sideproject.edit.controller
* @Description: TODO:
* @author chao
* @date 2019年6月25日上午10:44:34
* @version V1.0
*/
package org.liuhanchao.sideproject.edit.controller;

import org.liuhanchao.sideproject.edit.entity.UserVO;
import org.liuhanchao.sideproject.edit.service.IEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title EditController.java
 * @Package org.liuhanchao.sideproject.edit.controller
 * @Description: TODO:
 * @author chao
 * @date 2019年6月25日上午10:44:34
 * @version V1.0
 */
@RestController
@RequestMapping(value = "/edit")
public class EditController {
	
	@Autowired
	private IEditService editServiceImpl;
	
	/**
	 * 查询mysql当前登陆用户
	 * @Descrption
	 * @author chao
	 * @date 2019年6月26日上午9:44:46
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/userInfo",method = RequestMethod.POST)
	public UserVO queryUserInfo()throws Exception{
		UserVO userVO = this.editServiceImpl.queryUserInfo();
		return userVO;
	}
	/**
	 * 修改mysql信息
	 * @Descrption
	 * @author chao
	 * @date 2019年6月25日上午11:23:57
	 * @param userVO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/editMysql",method = RequestMethod.POST)
	public String editMysql(@RequestBody UserVO userVO) throws Exception{
		String result = this.editServiceImpl.editMysqlInfo(userVO);
		return result;
	}
	/**
	 * 查询postgresql当前登陆用户
	 * @Descrption
	 * @author chao
	 * @date 2019年6月26日上午9:46:26
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/postgreSQLInfo",method = RequestMethod.POST)
	public UserVO queryPostgreSQLInfo()throws Exception{
		UserVO userVO = this.editServiceImpl.queryPostgreSQLInfo();
		return userVO;
	}
	/**
	 * 修改postgresql用户密码
	 * @Descrption
	 * @author chao
	 * @date 2019年6月26日上午9:48:13
	 * @param UserVO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/editPostgreSQL",method = RequestMethod.POST)
	public String editPostgreSQL(@RequestBody UserVO UserVO)throws Exception{
		String result = this.editServiceImpl.editPostgreSQLInfo(UserVO);
		return result;
	}
	/**
	 * 查询禅道用户信息
	 * @Descrption
	 * @author chao
	 * @date 2019年6月26日上午11:14:02
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/zentaoUserInfo",method = RequestMethod.POST)
	public UserVO queryZenTaoUserInfo()throws Exception{
		return null;
	}
	/**
	 * 修改禅道用户密码
	 * @Descrption
	 * @author chao
	 * @date 2019年6月26日上午11:15:32
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/editZenTao",method = RequestMethod.POST)
	public String editZenTao()throws Exception{
		return null;
	}

}
