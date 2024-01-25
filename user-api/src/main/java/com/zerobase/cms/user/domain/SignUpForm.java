package com.zerobase.cms.user.domain;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignUpForm {
    private String email;
    private String name;
    private String password;
    private LocalDate birth;
    private String phone;
}
