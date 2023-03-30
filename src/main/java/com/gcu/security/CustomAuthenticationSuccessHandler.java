package com.gcu.security;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

  public CustomAuthenticationSuccessHandler() {
    super();
    setUseReferer(true);
    System.out.println();
  }
  

}
