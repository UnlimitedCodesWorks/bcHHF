package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.IntroduceDao;
import com.c6.city.model.Introduce;

public class IntroduceDaoImpl extends JdbcDaoSupport implements IntroduceDao{
	
	public List<Introduce> findBeautyWords(String VillPlace){
		String sql="SELECT infoTitle,infoContent FROM villall,villinfo,infohead WHERE villall.villNo=villinfo.villNo AND villinfo.infoNo=infohead.infoNo AND villall.villPlace='"+VillPlace+"' AND villinfo.infoKind='美景';";
		List<Introduce> bws=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Introduce.class));
		return bws;
	}
	
	public List<Introduce> findBeautyPicture(String VillPlace){
		String sql="SELECT infoImg,imgTitle FROM villall,villinfo,infoimg WHERE villall.villNo=villinfo.villNo AND villinfo.infoNo=infoimg.infoNo AND villall.villPlace='"+VillPlace+"' AND villinfo.infoKind='美景';";
		List<Introduce> bps=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Introduce.class));
		return bps;
	}
	
	public List<Introduce> findContureWords(String VillPlace){
		String sql="SELECT infoTitle,infoContent FROM villall,villinfo,infohead WHERE villall.villNo=villinfo.villNo AND villinfo.infoNo=infohead.infoNo AND villall.villPlace='"+VillPlace+"' AND villinfo.infoKind='文化';";
		List<Introduce> cws=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Introduce.class));
		return cws;
	}
	
	public List<Introduce> findConturePicture(String VillPlace){
		String sql="SELECT infoImg,imgTitle FROM villall,villinfo,infoimg WHERE villall.villNo=villinfo.villNo AND villinfo.infoNo=infoimg.infoNo AND villall.villPlace='"+VillPlace+"' AND villinfo.infoKind='文化';";
		List<Introduce> cps=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Introduce.class));
		return cps;
	}
	
	public List<Introduce> findSpecialWords(String VillPlace){
		String sql="SELECT infoTitle,infoContent FROM villall,villinfo,infohead WHERE villall.villNo=villinfo.villNo AND villinfo.infoNo=infohead.infoNo AND villall.villPlace='"+VillPlace+"' AND villinfo.infoKind='特产';";
		List<Introduce> sws=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Introduce.class));
		return sws;
	}
	
	public List<Introduce> findSpecialPicture(String VillPlace){
		String sql="SELECT infoImg,imgTitle FROM villall,villinfo,infoimg WHERE villall.villNo=villinfo.villNo AND villinfo.infoNo=infoimg.infoNo AND villall.villPlace='"+VillPlace+"' AND villinfo.infoKind='特产';";
		List<Introduce> sps=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Introduce.class));
		return sps;
	}
	
	public List<Introduce> findTripWords(String VillPlace){
		String sql="SELECT infoTitle,infoContent FROM villall,villinfo,infohead WHERE villall.villNo=villinfo.villNo AND villinfo.infoNo=infohead.infoNo AND villall.villPlace='"+VillPlace+"' AND villinfo.infoKind='旅游';";
		List<Introduce> tws=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Introduce.class));
		return tws;
	}
	
	public List<Introduce> findTripPicture(String VillPlace){
		String sql="SELECT infoImg,imgTitle FROM villall,villinfo,infoimg WHERE villall.villNo=villinfo.villNo AND villinfo.infoNo=infoimg.infoNo AND villall.villPlace='"+VillPlace+"' AND villinfo.infoKind='旅游';";
		List<Introduce> tps=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Introduce.class));
		return tps;
	}
}
