package com.example.board3.service;

import com.example.board3.mapper.JoinMapper;

import com.example.board3.model.MemberVO;

import org.springframework.stereotype.Service;

@Service
public class JoinMemberServiceImpl implements JoinMemberService{

  private final JoinMapper joinMapper;

  public JoinMemberServiceImpl(JoinMapper joinMapper) {
    this.joinMapper = joinMapper;
  }

  @Override
  public void save(MemberVO mvo) {
    joinMapper.addMember(mvo);
  }

  @Override
  public void delete(String id) {
    joinMapper.deleteMember(id);
  }

  @Override
  public void update(MemberVO mvo) {
    joinMapper.updateMember(mvo);
  }

  @Override
  public int selectDupId(String id) {
    int cnt = joinMapper.selectId(id);

    return cnt;
  }

  @Override
  public int login(MemberVO mvo) {
    int login = joinMapper.selectMemberCnt(mvo);
    return login;
  }

  public MemberVO selectMember(String id){
    MemberVO selectVo = joinMapper.selectMember(id);
    return selectVo;
  }
}
