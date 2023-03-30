package com.gcu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private CustomUserDetailsService userDetailsService;
	
	
	
	@Autowired
	public SecurityConfig(CustomUserDetailsService userDetailsService) {
		super();
		this.userDetailsService = userDetailsService;
	}
	
	  @Bean
	  AuthenticationSuccessHandler authenticationSuccessHandler() {
	    return new CustomAuthenticationSuccessHandler();
	  }

	  @Bean
	  AuthenticationFailureHandler authenticationFailureHandler() {
	    return new CustomAuthenticationFailureHandler();
	  }
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http
                .csrf().disable()
                .authorizeRequests()
                	.antMatchers("/resources/**", "/static/**" , "/images/**", "/css/**", "/js/**").permitAll()
                    .antMatchers("/api/auth/**").authenticated()
                    .antMatchers("/login").permitAll()
                    .antMatchers(HttpMethod.POST).hasRole("ADMIN")
                    .antMatchers("welcome", "/user**").hasAnyRole("ADMIN", "USER")
                    .antMatchers("/admin**" , "/").hasRole("ADMIN")
                    
                    .anyRequest()
                    .authenticated()
                .and()
                .formLogin()
                	.loginPage("/login")
                	.usernameParameter("username")
                	.passwordParameter("password")
                	.loginProcessingUrl("/process-login")
                	.failureUrl("/login?error=true")
                	.successHandler(authenticationSuccessHandler())
                	.failureHandler(authenticationFailureHandler())
                	.defaultSuccessUrl("/welcome")
				.and()
				.logout()
					.logoutSuccessUrl("/login?logout=true")
					.invalidateHttpSession(true)
					.deleteCookies("JSESSIONID")
					.permitAll()
				.and()
				.httpBasic();
		
		return http.build();
		
	}
	
	
//	@Bean
//	public UserDetailsService users() {
//		UserDetails admin = User.builder()
//				.username("admin")
//				.password("password")
//				.roles("ADMIN")
//				.build();
//		UserDetails user = User.builder()
//
//				.username("user")
//				.password("password")
//				.roles("USER")
//				.build();
//		return new InMemoryUserDetailsManager(admin, user);
//	}
	
	@Bean
	public AuthenticationManager authenticationManger(
			AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
		
	}
			
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	

}
