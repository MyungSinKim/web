package com.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.domain.Member;
import com.web.repository.MemberRepository;

@RestController
@RequestMapping("/api/member")
public class MemberRestController {
	@Autowired
	private MemberRepository memberDao;
	
	@RequestMapping("/del/{id}")
	public String delete(@PathVariable int id){
		System.out.println("id=" + id);
		memberDao.delete(id);
		return "redirect:/member/list";
	}
	
	@RequestMapping("/add")
	public Member add(Member member){
		Member memberData = memberDao.save(member);
		return memberData;
	}
	
	@RequestMapping("/view/{id}")
	public Member view(@PathVariable int id){
		Member memberData = memberDao.findOne(id);
		return memberData;
	}	

	@RequestMapping("/list")
	public List<Member> list(){
		List<Member> memberList = memberDao.findAll();
		return memberList;
	}
	
	@RequestMapping("/edit/{id}")
	public Member edit(Member member){
		Member memberData = memberDao.save(member);
		return memberData;
	}
}
