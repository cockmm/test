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


public class StRvfcchBManagerTest extends BaseManagerTestCase{

	private StRvfcchBManager manager;
	
	@Autowired
	public void setStRvfcchBManager(StRvfcchBManager manager) {
		this.manager = manager;
	}

    @Override
    protected String[] getDbUnitDataFiles() {
        //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
        return new String[]{"classpath:testdata/common.xml","classpath:testdata/StRvfcchB.xml",
                            "classpath:testdata/StRvfcchB_"+TestMethodContext.getMethodName()+".xml"};
    }

	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void crud() {

		StRvfcchB obj = newStRvfcchB();
		manager.save(obj);
		manager.getEntityDao().flush();
		
		manager.update(obj);
		manager.getEntityDao().flush();
		
		assertNotNull(obj.getStcd());
		
		manager.removeById(obj.getStcd());
		manager.getEntityDao().flush();
	
	}
	
	public static StRvfcchB newStRvfcchB() {
		StRvfcchB obj = new StRvfcchB();
		
	  	obj.setLdkel(new Long("1"));
	  	obj.setRdkel(new Long("1"));
	  	obj.setWrz(new Long("1"));
	  	obj.setWrq(new Long("1"));
	  	obj.setGrz(new Long("1"));
	  	obj.setGrq(new Long("1"));
	  	obj.setFlpq(new Long("1"));
	  	obj.setObhtz(new Long("1"));
	  	obj.setObhtztm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setIvhz(new Long("1"));
	  	obj.setIvhztm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setObmxq(new Long("1"));
	  	obj.setObmxqtm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setIvmxq(new Long("1"));
	  	obj.setIvmxqtm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHmxs(new Long("1"));
	  	obj.setHmxstm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHmxavv(new Long("1"));
	  	obj.setHmxavvtm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHlz(new Long("1"));
	  	obj.setHlztm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHmnq(new Long("1"));
	  	obj.setHmnqtm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setTza(new Long("1"));
	  	obj.setTaq(new Long("1"));
	  	obj.setLaz(new Long("1"));
	  	obj.setLaq(new Long("1"));
	  	obj.setSfz(new Long("1"));
	  	obj.setSfq(new Long("1"));
	  	obj.setModitime(new java.util.Date(System.currentTimeMillis()));
		return obj;
	}
}
