package com.entity.view;

import com.entity.KaoshichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考试成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
@TableName("kaoshichengji")
public class KaoshichengjiView  extends KaoshichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshichengjiView(){
	}
 
 	public KaoshichengjiView(KaoshichengjiEntity kaoshichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
