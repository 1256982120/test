/**
* Copyright 2019 anxinyiheng.com Inc. All Rights Reserved. 
* @Title EditServiceImpl.java
* @Package org.liuhanchao.sideproject.edit.service.impl
* @Description: TODO:
* @author chao
* @date 2019年6月25日上午10:45:25
* @version V1.0
*/
package org.liuhanchao.sideproject.edit.service.impl;

import org.liuhanchao.sideproject.edit.entity.UserVO;
import org.liuhanchao.sideproject.edit.mapper.EditDao;
import org.liuhanchao.sideproject.edit.service.IEditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title EditServiceImpl.java
 * @Package org.liuhanchao.sideproject.edit.service.impl
 * @Description: TODO:
 * @author chao
 * @date 2019年6月25日上午10:45:25
 * @version V1.0
 */
@Service
public class EditServiceImpl implements IEditService{

	Logger log = LoggerFactory.getLogger(EditServiceImpl.class);
	
	@Autowired
	private EditDao editDao;
	
	@Override
	public String editMysqlInfo(UserVO userVO) throws Exception {
		if(userVO == null){
			return "die";
		}
		UserVO userVOParam = new UserVO();
		userVOParam.setUserName(userVO.getUserName());
		userVOParam.setNewPassWord(userVO.getNewPassWord());
		try {
			this.editDao.editMysqlInfo(userVOParam);
			this.editDao.refreshPermissions();//刷新数据库用户权限信息
		} catch (Exception e) {
			log.error("editMysqlInfo die"+e);
		}
		return "succ";
	}

	@Override
	public UserVO queryUserInfo() throws Exception {
		UserVO userVO = null;
		try {
			userVO = this.editDao.selectUserInfo();
		} catch (Exception e) {
			log.error("selectUserInfo die"+e);
		}
		return userVO;
	}

	@Override
	public UserVO queryPostgreSQLInfo() throws Exception {
		UserVO userVO = null;
		try {
			userVO = this.editDao.selectPostgreSQLUserInfo();
		} catch (Exception e) {
			log.error("selectPostgreSQLUserInfo die"+e);
		}
		return userVO;
	}

	@Override
	public String editPostgreSQLInfo(UserVO userVO) throws Exception {
		if(userVO == null){
			log.warn("userVO is null");
			return "die";
		}
		UserVO userVOParam = new UserVO();
		userVOParam.setUserName(userVO.getUserName());
		userVOParam.setNewPassWord(userVO.getNewPassWord());
		try {
			this.editDao.editPostgreSQLInfo(userVOParam);
		} catch (Exception e) {
			log.error("editPostgreSQLInfo die"+e);
		}
		return "succ";
	}

}
