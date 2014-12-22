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


public class StRsvrfcchBDaoTest extends BaseDaoTestCase{
	
	private StRsvrfcchBDao dao;
	
	@Autowired
	public void setStRsvrfcchBDao(StRsvrfcchBDao dao) {
		this.dao = dao;
	}

	@Override 
	protected String[] getDbUnitDataFiles() {
	    //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
		return new String[]{"classpath:testdata/common.xml","classpath:testdata/StRsvrfcchB.xml",
		                    "classpath:testdata/StRsvrfcchB_"+TestMethodContext.getMethodName()+".xml"};
	}
	
	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void findPage() {

		StRsvrfcchBQuery query = newStRsvrfcchBQuery();
		Page page = dao.findPage(query);
		
		assertEquals(pageNumber,page.getThisPageNumber());
		assertEquals(pageSize,page.getPageSize());
		List resultList = (List)page.getResult();
		assertNotNull(resultList);
		
	}
	
	static int pageNumber = 1;
	static int pageSize = 10;	
	public static StRsvrfcchBQuery newStRsvrfcchBQuery() {
		StRsvrfcchBQuery query = new StRsvrfcchBQuery();
		query.setPageNumber(pageNumber);
		query.setPageSize(pageSize);
		query.setSortColumns(null);
		
	  	query.setRsvrtp(new String("1"));
	  	query.setDamel(new Long("1"));
	  	query.setCkflz(new Long("1"));
	  	query.setDsflz(new Long("1"));
	  	query.setNormz(new Long("1"));
	  	query.setDdz(new Long("1"));
	  	query.setActz(new Long("1"));
	  	query.setTtcp(new Long("1"));
	  	query.setFldcp(new Long("1"));
	  	query.setActcp(new Long("1"));
	  	query.setDdcp(new Long("1"));
	  	query.setHhrz(new Long("1"));
	  	query.setHmxw(new Long("1"));
		query.setHhrztmBegin(new Date(System.currentTimeMillis()));
		query.setHhrztmEnd(new Date(System.currentTimeMillis()));
	  	query.setHmxinq(new Long("1"));
	  	query.setRstdr(new Long("1"));
		query.setHmxinqtmBegin(new Date(System.currentTimeMillis()));
		query.setHmxinqtmEnd(new Date(System.currentTimeMillis()));
	  	query.setHmxotq(new Long("1"));
		query.setHmxotqtmBegin(new Date(System.currentTimeMillis()));
		query.setHmxotqtmEnd(new Date(System.currentTimeMillis()));
	  	query.setHlrz(new Long("1"));
		query.setHlrztmBegin(new Date(System.currentTimeMillis()));
		query.setHlrztmEnd(new Date(System.currentTimeMillis()));
	  	query.setHmninq(new Long("1"));
		query.setHmninqtmBegin(new Date(System.currentTimeMillis()));
		query.setHmninqtmEnd(new Date(System.currentTimeMillis()));
	  	query.setLaz(new Long("1"));
	  	query.setSfq(new Long("1"));
		query.setModitimeBegin(new Date(System.currentTimeMillis()));
		query.setModitimeEnd(new Date(System.currentTimeMillis()));
		return query;
	}
	
}
