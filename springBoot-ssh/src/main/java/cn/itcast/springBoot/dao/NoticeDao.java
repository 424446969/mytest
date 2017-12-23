package cn.itcast.springBoot.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.itcast.springBoot.entity.Notice;

@Repository
public interface NoticeDao extends JpaRepository<Notice, Serializable> {

}
