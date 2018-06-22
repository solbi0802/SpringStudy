package com.bb.kitri;

import java.util.ArrayList;

public interface MemberDAO {
	ArrayList<Member> getMembers();
	Member getMember(String name);
	void insertMember(Member member);
	void updateMember(Member member);
	void deleteMember(String name);
}
