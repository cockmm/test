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


public class StRsvrRDaoTest extends BaseDaoTestCase{
	
	private StRsvrRDao dao;
	
	@Autowired
	public void setStRsvrRDao(StRsvrRDao dao) {
		this.dao = dao;
	}

	@Override 
	protected String[] getDbUnitDataFiles() {
	    //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
		return new String[]{"classpath:testdata/common.xml","classpath:testdata/StRsvrR.xml",
		                    "classpath:testdata/StRsvrR_"+TestMethodContext.getMethodName()+".xml"};
	}
	
	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void findPage() {

		StRsvrRQuery query = newStRsvrRQuery();
		Page page = dao.findPage(query);
		
		assertEquals(pageNumber,page.getThisPageNumber());
		assertEquals(pageSize,page.getPageSize());
		List resultList = (List)page.getResult();
		assertNotNull(resultList);
		
	}
	
	static int pageNumber = 1;
	static int pageSize = 10;	
	public static StRsvrRQuery newStRsvrRQuery() {
		StRsvrRQuery query = new StRsvrRQuery();
		query.setPageNumber(pageNumber);
		query.setPageSize(pageSize);
		query.setSortColumns(null);
		
	  	query.setRz(new Long("1"));
	  	query.setInq(new Long("1"));
	  	query.setW(new Long("1"));
	  	query.setBlrz(new Long("1"));
	  	query.setOtq(new Long("1"));
	  	query.setRwchrcd(new String("1"));
	  	query.setRwptn(new String("1"));
	  	query.setInqdr(new Long("1"));
	  	query.setMsqmt(new String("1"));
		return query;
	}
	
}
