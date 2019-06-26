/**
* Copyright 2019 anxinyiheng.com Inc. All Rights Reserved. 
* @Title EditDao.java
* @Package org.liuhanchao.sideproject.edit.mapper
* @Description: TODO:
* @author chao
* @date 2019年6月25日上午10:53:25
* @version V1.0
*/
package org.liuhanchao.sideproject.edit.mapper;

import org.liuhanchao.sideproject.edit.entity.UserVO;

/**
 * @Title EditDao.java
 * @Package org.liuhanchao.sideproject.edit.mapper
 * @Description: TODO:
 * @author chao
 * @date 2019年6月25日上午10:53:25
 * @version V1.0
 */
public interface EditDao {
	
	UserVO selectUserInfo() throws Exception;
	int editMysqlInfo(UserVO userVO) throws Exception;
	/**
	 * 刷新权限
	 * @Descrption
	 * @author chao
	 * @date 2019年6月25日下午5:36:27
	 * @return
	 * @throws Exception
	 */
	int refreshPermissions()throws Exception;
	UserVO selectPostgreSQLUserInfo() throws Exception;
	int editPostgreSQLInfo(UserVO userVO) throws Exception;

}
