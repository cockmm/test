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


public class StStbprpBManagerTest extends BaseManagerTestCase{

	private StStbprpBManager manager;
	
	@Autowired
	public void setStStbprpBManager(StStbprpBManager manager) {
		this.manager = manager;
	}

    @Override
    protected String[] getDbUnitDataFiles() {
        //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
        return new String[]{"classpath:testdata/common.xml","classpath:testdata/StStbprpB.xml",
                            "classpath:testdata/StStbprpB_"+TestMethodContext.getMethodName()+".xml"};
    }

	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void crud() {

		StStbprpB obj = newStStbprpB();
		manager.save(obj);
		manager.getEntityDao().flush();
		
		manager.update(obj);
		manager.getEntityDao().flush();
		
		assertNotNull(manager.getById(obj.getId()));
		
		manager.removeById(obj.getId());
		manager.getEntityDao().flush();
	
	}
	
	public static StStbprpB newStStbprpB() {
		StStbprpB obj = new StStbprpB();
		
	  	obj.setStnm(new java.lang.String("1"));
	  	obj.setRvnm(new java.lang.String("1"));
	  	obj.setHnnm(new java.lang.String("1"));
	  	obj.setBsnm(new java.lang.String("1"));
	  	obj.setLgtd(new Long("1"));
	  	obj.setLttd(new Long("1"));
	  	obj.setStlc(new java.lang.String("1"));
	  	obj.setAddvcd(new java.lang.String("1"));
	  	obj.setDtmnm(new java.lang.String("1"));
	  	obj.setDtmel(new Long("1"));
	  	obj.setDtpr(new Long("1"));
	  	obj.setSttp(new java.lang.String("1"));
	  	obj.setFrgrd(new java.lang.String("1"));
	  	obj.setEsstym(new java.lang.String("1"));
	  	obj.setBgfrym(new java.lang.String("1"));
	  	obj.setAtcunit(new java.lang.String("1"));
	  	obj.setAdmauth(new java.lang.String("1"));
	  	obj.setStbk(new java.lang.String("1"));
	  	obj.setStazt(new Integer("1"));
	  	obj.setDstrvm(new Long("1"));
	  	obj.setDrna(new java.lang.Integer("1"));
	  	obj.setPhcd(new java.lang.String("1"));
	  	obj.setUsfl(new java.lang.String("1"));
	  	obj.setComments(new java.lang.String("1"));
	  	obj.setModitime(new java.util.Date(System.currentTimeMillis()));
		return obj;
	}
}
