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


public class StRsvrRManagerTest extends BaseManagerTestCase{

	private StRsvrRManager manager;
	
	@Autowired
	public void setStRsvrRManager(StRsvrRManager manager) {
		this.manager = manager;
	}

    @Override
    protected String[] getDbUnitDataFiles() {
        //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
        return new String[]{"classpath:testdata/common.xml","classpath:testdata/StRsvrR.xml",
                            "classpath:testdata/StRsvrR_"+TestMethodContext.getMethodName()+".xml"};
    }

	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void crud() {

		StRsvrR obj = newStRsvrR();
		manager.save(obj);
		manager.getEntityDao().flush();
		
		manager.update(obj);
		manager.getEntityDao().flush();
		
		assertNotNull(manager.getById(obj.getId()));
		
		manager.removeById(obj.getId());
		manager.getEntityDao().flush();
	
	}
	
	public static StRsvrR newStRsvrR() {
		StRsvrR obj = new StRsvrR();
		
	  	obj.setRz(new Long("1"));
	  	obj.setInq(new Long("1"));
	  	obj.setW(new Long("1"));
	  	obj.setBlrz(new Long("1"));
	  	obj.setOtq(new Long("1"));
	  	obj.setRwchrcd(new java.lang.String("1"));
	  	obj.setRwptn(new java.lang.String("1"));
	  	obj.setInqdr(new Long("1"));
	  	obj.setMsqmt(new java.lang.String("1"));
		return obj;
	}
}
