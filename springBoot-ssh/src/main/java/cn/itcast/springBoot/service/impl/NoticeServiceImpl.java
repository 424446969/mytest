package cn.itcast.springBoot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.springBoot.dao.NoticeDao;
import cn.itcast.springBoot.entity.Notice;
import cn.itcast.springBoot.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService {
	@Resource
	private NoticeDao noticeDao;
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

}
