package net.musecom.mem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import net.musecom.mem.dto.MemberDTO;
import net.musecom.mem.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberController {

    //생성자 주입
    private final MemberService memberService;

    //회원가입 페이지
    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }
     

    @PostMapping("/member/save")
    // public String save(
    //     @RequestParam("memEmail") String memEmail,
    //     @RequestParam("memPassword") String memPassword,
    //     @RequestParam("memName") String memName
    // ) {
    //     System.out.println("MemberController.save");
    //     return "index";
    // }
    public String save(@ModelAttribute MemberDTO memberDTO){
           System.out.println("MemberController.save");
           System.out.println("memberDTO = " + memberDTO);

           //MemberService memberService = new MemberService();
           //memberService.save();

           memberService.save(memberDTO);

           return "index";
    }
    
}
