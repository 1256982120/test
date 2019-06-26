/**
* Copyright 2019 anxinyiheng.com Inc. All Rights Reserved. 
* @Title EditService.java
* @Package org.liuhanchao.sideproject.edit.service
* @Description: TODO:
* @author chao
* @date 2019年6月25日上午10:44:59
* @version V1.0
*/
package org.liuhanchao.sideproject.edit.service;

import org.liuhanchao.sideproject.edit.entity.UserVO;

/**
 * @Title EditService.java
 * @Package org.liuhanchao.sideproject.edit.service
 * @Description: TODO:
 * @author chao
 * @date 2019年6月25日上午10:44:59
 * @version V1.0
 */
public interface IEditService {
	
	UserVO queryUserInfo()throws Exception;
	String editMysqlInfo(UserVO userVO) throws Exception;
	UserVO queryPostgreSQLInfo()throws Exception;
	String editPostgreSQLInfo(UserVO userVO) throws Exception;

}
