package net.musecom.mem.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.musecom.mem.dto.MemberDTO;
import net.musecom.mem.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO){

    }
}
