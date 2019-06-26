/**
* Copyright 2019 anxinyiheng.com Inc. All Rights Reserved. 
* @Title MessageTop.java
* @Package org.liuhanchao.sideproject
* @Description: TODO:
* @author chao
* @date 2019年5月29日下午2:09:25
* @version V1.0
*/
package org.liuhanchao.sideproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Title MessageTop.java
 * @Package org.liuhanchao.sideproject
 * @Description: TODO:
 * @author chao
 * @date 2019年5月29日下午2:09:25
 * @version V1.0
 */
@SpringBootApplication
@ComponentScan(value = "org.liuhanchao")
@MapperScan(basePackages = "org.liuhanchao.sideproject")
public class editpass {

	/**
	 * @Descrption
	 * @author chao
	 * @date 2019年5月29日下午2:09:26
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(editpass.class, args);
	}

}
