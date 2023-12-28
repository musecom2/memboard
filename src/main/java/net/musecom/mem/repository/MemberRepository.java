package net.musecom.mem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.musecom.mem.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long>{
    
}
