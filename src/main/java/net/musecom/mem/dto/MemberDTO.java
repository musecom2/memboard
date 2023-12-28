package net.musecom.mem.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {
   private Long num;
   private String memEmail;
   private String memPassword;
   private String memName; 
}
