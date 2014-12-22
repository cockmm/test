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


public class StPptnRManagerTest extends BaseManagerTestCase{

	private StPptnRManager manager;
	
	@Autowired
	public void setStPptnRManager(StPptnRManager manager) {
		this.manager = manager;
	}

    @Override
    protected String[] getDbUnitDataFiles() {
        //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
        return new String[]{"classpath:testdata/common.xml","classpath:testdata/StPptnR.xml",
                            "classpath:testdata/StPptnR_"+TestMethodContext.getMethodName()+".xml"};
    }

	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void crud() {

		StPptnR obj = newStPptnR();
		manager.save(obj);
		manager.getEntityDao().flush();
		
		manager.update(obj);
		manager.getEntityDao().flush();
		
		assertNotNull(manager.getById(obj.getId()));
		
		manager.removeById(obj.getId());
		manager.getEntityDao().flush();
	
	}
	
	public static StPptnR newStPptnR() {
		StPptnR obj = new StPptnR();
		
	  	obj.setDrp(new Long("1"));
	  	obj.setIntv(new Long("1"));
	  	obj.setPdr(new Long("1"));
	  	obj.setDyp(new Long("1"));
	  	obj.setWth(new java.lang.String("1"));
		return obj;
	}
}
