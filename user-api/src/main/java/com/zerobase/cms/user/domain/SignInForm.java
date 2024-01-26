package com.zerobase.cms.user.domain;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignInForm {
    private String email;
    private String password;
}
