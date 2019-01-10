package com.comtrue.shsync.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.comtrue.shsync.mapper.TestMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED, rollbackFor = { Exception.class })
public class TestService {
	
	@Autowired
	private TestMapper testMapper;
	
	public Integer getCount() {
		return testMapper.getCount();
	}

}
