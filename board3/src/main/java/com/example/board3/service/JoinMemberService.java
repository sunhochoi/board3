package com.example.board3.service;

import com.example.board3.model.MemberVO;

public interface JoinMemberService {
  void save(MemberVO mvo);

  void delete(String id);

  void update(MemberVO nvo);

  int selectDupId(String id);

  int login(MemberVO mvo);

  MemberVO selectMember(String id);

}
