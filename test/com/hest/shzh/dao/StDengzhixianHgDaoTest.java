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


public class StDengzhixianHgDaoTest extends BaseDaoTestCase{
	
	private StDengzhixianHgDao dao;
	
	@Autowired
	public void setStDengzhixianHgDao(StDengzhixianHgDao dao) {
		this.dao = dao;
	}

	@Override 
	protected String[] getDbUnitDataFiles() {
	    //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
		return new String[]{"classpath:testdata/common.xml","classpath:testdata/StDengzhixianHg.xml",
		                    "classpath:testdata/StDengzhixianHg_"+TestMethodContext.getMethodName()+".xml"};
	}
	
	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void findPage() {

		StDengzhixianHgQuery query = newStDengzhixianHgQuery();
		Page page = dao.findPage(query);
		
		assertEquals(pageNumber,page.getThisPageNumber());
		assertEquals(pageSize,page.getPageSize());
		List resultList = (List)page.getResult();
		assertNotNull(resultList);
		
	}
	
	static int pageNumber = 1;
	static int pageSize = 10;	
	public static StDengzhixianHgQuery newStDengzhixianHgQuery() {
		StDengzhixianHgQuery query = new StDengzhixianHgQuery();
		query.setPageNumber(pageNumber);
		query.setPageSize(pageSize);
		query.setSortColumns(null);
		
		query.setHgTmBegin(new Date(System.currentTimeMillis()));
		query.setHgTmEnd(new Date(System.currentTimeMillis()));
	  	query.setHgDzxType(new Integer("1"));
	  	query.setHgRealtime(new Integer("1"));
	  	query.setHgResult(new Integer("1"));
	  	query.setHgProcess(new Integer("1"));
		return query;
	}
	
}
