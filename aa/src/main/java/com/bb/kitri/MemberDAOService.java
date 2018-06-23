package com.bb.kitri;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component("memService") //∫Û(bean) ∞¥√º ¡÷¿‘
public class MemberDAOService implements MemberDAO{
	@Resource(name= "sqlSession")
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public ArrayList<Member> getMembers() {
		ArrayList<Member> result = new ArrayList<Member>();
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		result = memberMapper.getMembers();
		return result;
	}

	@Override
	public Member getMember(String name) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		return memberMapper.getMember(name);
	}

	@Override
	public void insertMember(Member member) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		memberMapper.insertMember(member);
	}

	@Override
	public void updateMember(Member member) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		memberMapper.updateMember(member);
	}

	@Override
	public void deleteMember(String name) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		memberMapper.deleteMember(name);
	}
}
