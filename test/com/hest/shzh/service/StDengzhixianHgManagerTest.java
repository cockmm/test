/*
 * 
 */

package com.hest.shzh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;

import cn.org.rapid_framework.test.context.TestMethodContext;
import static junit.framework.Assert.*;

import java.util.*;

import javacommon.base.*;
import javacommon.util.*;

import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.hest.shzh.model.*;
import com.hest.shzh.dao.*;
import com.hest.shzh.service.*;
import com.hest.shzh.vo.query.*;

/**
 * 
 */


public class StDengzhixianHgManagerTest extends BaseManagerTestCase{

	private StDengzhixianHgManager manager;
	
	@Autowired
	public void setStDengzhixianHgManager(StDengzhixianHgManager manager) {
		this.manager = manager;
	}

    @Override
    protected String[] getDbUnitDataFiles() {
        //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
        return new String[]{"classpath:testdata/common.xml","classpath:testdata/StDengzhixianHg.xml",
                            "classpath:testdata/StDengzhixianHg_"+TestMethodContext.getMethodName()+".xml"};
    }

	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void crud() {

		StDengzhixianHg obj = newStDengzhixianHg();
		manager.save(obj);
		manager.getEntityDao().flush();
		
		manager.update(obj);
		manager.getEntityDao().flush();
		
		assertNotNull(obj.getId());
		
		manager.removeById(obj.getId());
		manager.getEntityDao().flush();
	
	}
	
	public static StDengzhixianHg newStDengzhixianHg() {
		StDengzhixianHg obj = new StDengzhixianHg();
		
	  	obj.setHgTm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHgDzxType(new java.lang.Integer("1"));
	  	obj.setHgRealtime(new java.lang.Integer("1"));
	  	obj.setHgResult(new java.lang.Integer("1"));
	  	obj.setHgProcess(new java.lang.Integer("1"));
		return obj;
	}
}
