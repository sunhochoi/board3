package com.example.board3;

import com.example.board3.model.MemberVO;
import com.example.board3.service.JoinMemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
public class MybatisTest {

  @Autowired
  JoinMemberService JoinService;
  MemberVO mvo;



  @Test
  public void  checkId (){
     String id = "superbiron";

     int check = JoinService.selectDupId(id);

     System.out.print("check "+ check);

  }


  @Test
  @Commit
  public void  savaMember (){
    mvo = new MemberVO();

    mvo.setId("superbiron");
    mvo.setPw("ss0025^^");
    mvo.setTel("010-2775-1859");
    mvo.setEmail("1203sunho@gmail.com");
    mvo.setAddr1("서울시 송파구 마천로 33길 11-9");
    mvo.setAddr2("프라자빌 402호");
    mvo.setAgreeYn("Y");
    mvo.setUsedYn("Y");
    mvo.setBirthDate("1985-12-03");
    mvo.setUserName("최선호");

    JoinService.save(mvo);

    System.out.println("id :"+mvo.getId());

    MemberVO printVo = JoinService.selectMember(mvo.getId());

    System.out.println("printVo :"+printVo);

  }

  @Test
  @Commit
  public void delete(){
    JoinService.delete("superbiron");
  }


  @Test
  @Commit
  public void update(){

    mvo = new MemberVO();
    mvo.setId("superbiron");
    mvo.setUserName("최순호");
    //mvo.setUsedYn("Y");
    System.out.println(mvo);
    JoinService.update(mvo);
  }

  @Test
  public void con (){
    try
      (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/notice",
      "root",
      "ss0025ss^^"
      )){
      System.out.println("con "+con);
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
