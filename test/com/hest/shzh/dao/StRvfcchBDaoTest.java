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


public class StRvfcchBDaoTest extends BaseDaoTestCase{
	
	private StRvfcchBDao dao;
	
	@Autowired
	public void setStRvfcchBDao(StRvfcchBDao dao) {
		this.dao = dao;
	}

	@Override 
	protected String[] getDbUnitDataFiles() {
	    //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
		return new String[]{"classpath:testdata/common.xml","classpath:testdata/StRvfcchB.xml",
		                    "classpath:testdata/StRvfcchB_"+TestMethodContext.getMethodName()+".xml"};
	}
	
	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void findPage() {

		StRvfcchBQuery query = newStRvfcchBQuery();
		Page page = dao.findPage(query);
		
		assertEquals(pageNumber,page.getThisPageNumber());
		assertEquals(pageSize,page.getPageSize());
		List resultList = (List)page.getResult();
		assertNotNull(resultList);
		
	}
	
	static int pageNumber = 1;
	static int pageSize = 10;	
	public static StRvfcchBQuery newStRvfcchBQuery() {
		StRvfcchBQuery query = new StRvfcchBQuery();
		query.setPageNumber(pageNumber);
		query.setPageSize(pageSize);
		query.setSortColumns(null);
		
	  	query.setLdkel(new Long("1"));
	  	query.setRdkel(new Long("1"));
	  	query.setWrz(new Long("1"));
	  	query.setWrq(new Long("1"));
	  	query.setGrz(new Long("1"));
	  	query.setGrq(new Long("1"));
	  	query.setFlpq(new Long("1"));
	  	query.setObhtz(new Long("1"));
		query.setObhtztmBegin(new Date(System.currentTimeMillis()));
		query.setObhtztmEnd(new Date(System.currentTimeMillis()));
	  	query.setIvhz(new Long("1"));
		query.setIvhztmBegin(new Date(System.currentTimeMillis()));
		query.setIvhztmEnd(new Date(System.currentTimeMillis()));
	  	query.setObmxq(new Long("1"));
		query.setObmxqtmBegin(new Date(System.currentTimeMillis()));
		query.setObmxqtmEnd(new Date(System.currentTimeMillis()));
	  	query.setIvmxq(new Long("1"));
		query.setIvmxqtmBegin(new Date(System.currentTimeMillis()));
		query.setIvmxqtmEnd(new Date(System.currentTimeMillis()));
	  	query.setHmxs(new Long("1"));
		query.setHmxstmBegin(new Date(System.currentTimeMillis()));
		query.setHmxstmEnd(new Date(System.currentTimeMillis()));
	  	query.setHmxavv(new Long("1"));
		query.setHmxavvtmBegin(new Date(System.currentTimeMillis()));
		query.setHmxavvtmEnd(new Date(System.currentTimeMillis()));
	  	query.setHlz(new Long("1"));
		query.setHlztmBegin(new Date(System.currentTimeMillis()));
		query.setHlztmEnd(new Date(System.currentTimeMillis()));
	  	query.setHmnq(new Long("1"));
		query.setHmnqtmBegin(new Date(System.currentTimeMillis()));
		query.setHmnqtmEnd(new Date(System.currentTimeMillis()));
	  	query.setTza(new Long("1"));
	  	query.setTaq(new Long("1"));
	  	query.setLaz(new Long("1"));
	  	query.setLaq(new Long("1"));
	  	query.setSfz(new Long("1"));
	  	query.setSfq(new Long("1"));
		query.setModitimeBegin(new Date(System.currentTimeMillis()));
		query.setModitimeEnd(new Date(System.currentTimeMillis()));
		return query;
	}
	
}
