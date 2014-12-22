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


public class StRsvrfcchBManagerTest extends BaseManagerTestCase{

	private StRsvrfcchBManager manager;
	
	@Autowired
	public void setStRsvrfcchBManager(StRsvrfcchBManager manager) {
		this.manager = manager;
	}

    @Override
    protected String[] getDbUnitDataFiles() {
        //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
        return new String[]{"classpath:testdata/common.xml","classpath:testdata/StRsvrfcchB.xml",
                            "classpath:testdata/StRsvrfcchB_"+TestMethodContext.getMethodName()+".xml"};
    }

	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void crud() {

		StRsvrfcchB obj = newStRsvrfcchB();
		manager.save(obj);
		manager.getEntityDao().flush();
		
		manager.update(obj);
		manager.getEntityDao().flush();
		
		assertNotNull(obj.getStcd());
		
		manager.removeById(obj.getStcd());
		manager.getEntityDao().flush();
	
	}
	
	public static StRsvrfcchB newStRsvrfcchB() {
		StRsvrfcchB obj = new StRsvrfcchB();
		
	  	obj.setRsvrtp(new java.lang.String("1"));
	  	obj.setDamel(new Long("1"));
	  	obj.setCkflz(new Long("1"));
	  	obj.setDsflz(new Long("1"));
	  	obj.setNormz(new Long("1"));
	  	obj.setDdz(new Long("1"));
	  	obj.setActz(new Long("1"));
	  	obj.setTtcp(new Long("1"));
	  	obj.setFldcp(new Long("1"));
	  	obj.setActcp(new Long("1"));
	  	obj.setDdcp(new Long("1"));
	  	obj.setHhrz(new Long("1"));
	  	obj.setHmxw(new Long("1"));
	  	obj.setHhrztm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHmxinq(new Long("1"));
	  	obj.setRstdr(new Long("1"));
	  	obj.setHmxinqtm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHmxotq(new Long("1"));
	  	obj.setHmxotqtm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHlrz(new Long("1"));
	  	obj.setHlrztm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setHmninq(new Long("1"));
	  	obj.setHmninqtm(new java.util.Date(System.currentTimeMillis()));
	  	obj.setLaz(new Long("1"));
	  	obj.setSfq(new Long("1"));
	  	obj.setModitime(new java.util.Date(System.currentTimeMillis()));
		return obj;
	}
}
