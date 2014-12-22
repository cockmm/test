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


public class StRsvrfsrBDaoTest extends BaseDaoTestCase{
	
	private StRsvrfsrBDao dao;
	
	@Autowired
	public void setStRsvrfsrBDao(StRsvrfsrBDao dao) {
		this.dao = dao;
	}

	@Override 
	protected String[] getDbUnitDataFiles() {
	    //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
		return new String[]{"classpath:testdata/common.xml","classpath:testdata/StRsvrfsrB.xml",
		                    "classpath:testdata/StRsvrfsrB_"+TestMethodContext.getMethodName()+".xml"};
	}
	
	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void findPage() {

		StRsvrfsrBQuery query = newStRsvrfsrBQuery();
		Page page = dao.findPage(query);
		
		assertEquals(pageNumber,page.getThisPageNumber());
		assertEquals(pageSize,page.getPageSize());
		List resultList = (List)page.getResult();
		assertNotNull(resultList);
		
	}
	
	static int pageNumber = 1;
	static int pageSize = 10;	
	public static StRsvrfsrBQuery newStRsvrfsrBQuery() {
		StRsvrfsrBQuery query = new StRsvrfsrBQuery();
		query.setPageNumber(pageNumber);
		query.setPageSize(pageSize);
		query.setSortColumns(null);
		
	  	query.setEdmd(new String("1"));
	  	query.setFsltdz(new Long("1"));
	  	query.setFsltdw(new Long("1"));
	  	query.setFstp(new String("1"));
		query.setModitimeBegin(new Date(System.currentTimeMillis()));
		query.setModitimeEnd(new Date(System.currentTimeMillis()));
		return query;
	}
	
}
