package com.example.study.repository;

import com.example.study.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {

// JQPL방식
//    @Query("SELECT m FROM MEMBER m WHERE m.userName = :userName")
//    Optional<Member> findOneMember(@Param("userName") String userName);

}
