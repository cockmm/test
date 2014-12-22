/*
 * 
 */

package com.hest.shzh.dao;

import java.util.List;

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


public class StStbprpBDaoTest extends BaseDaoTestCase{
	
	private StStbprpBDao dao;
	
	@Autowired
	public void setStStbprpBDao(StStbprpBDao dao) {
		this.dao = dao;
	}

	@Override 
	protected String[] getDbUnitDataFiles() {
	    //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
		return new String[]{"classpath:testdata/common.xml","classpath:testdata/StStbprpB.xml",
		                    "classpath:testdata/StStbprpB_"+TestMethodContext.getMethodName()+".xml"};
	}
	
	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void findPage() {

		StStbprpBQuery query = newStStbprpBQuery();
		Page page = dao.findPage(query);
		
		assertEquals(pageNumber,page.getThisPageNumber());
		assertEquals(pageSize,page.getPageSize());
		List resultList = (List)page.getResult();
		assertNotNull(resultList);
		
	}
	
	static int pageNumber = 1;
	static int pageSize = 10;	
	public static StStbprpBQuery newStStbprpBQuery() {
		StStbprpBQuery query = new StStbprpBQuery();
		query.setPageNumber(pageNumber);
		query.setPageSize(pageSize);
		query.setSortColumns(null);
		
	  	query.setStnm(new String("1"));
	  	query.setRvnm(new String("1"));
	  	query.setHnnm(new String("1"));
	  	query.setBsnm(new String("1"));
	  	query.setLgtd(new Long("1"));
	  	query.setLttd(new Long("1"));
	  	query.setStlc(new String("1"));
	  	query.setAddvcd(new String("1"));
	  	query.setDtmnm(new String("1"));
	  	query.setDtmel(new Long("1"));
	  	query.setDtpr(new Long("1"));
	  	query.setSttp(new String("1"));
	  	query.setFrgrd(new String("1"));
	  	query.setEsstym(new String("1"));
	  	query.setBgfrym(new String("1"));
	  	query.setAtcunit(new String("1"));
	  	query.setAdmauth(new String("1"));
	  	query.setStbk(new String("1"));
	  	query.setStazt(new Integer("1"));
	  	query.setDstrvm(new Long("1"));
	  	query.setDrna(new Integer("1"));
	  	query.setPhcd(new String("1"));
	  	query.setUsfl(new String("1"));
	  	query.setComments(new String("1"));
		query.setModitimeBegin(new Date(System.currentTimeMillis()));
		query.setModitimeEnd(new Date(System.currentTimeMillis()));
		return query;
	}
	
}
