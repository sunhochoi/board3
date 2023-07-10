package com.example.board3.mapper;

import com.example.board3.model.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinMapper {

  public void addMember(MemberVO mvo);


  public void deleteMember(String id);


  public void updateMember(MemberVO mvo);


  public int selectId(String id);


  public int selectMemberCnt(MemberVO mvo);


  public MemberVO selectMember(String id);

}
