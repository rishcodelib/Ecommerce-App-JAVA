//package com.aggarwal.EcommerceApp.Security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//import com.aggarwal.EcommerceApp.Services.UserDetailsService;
//
//public class Security extends WebSecurityConfigurerAdapter {
//	@Autowired
//	UserDetailsService userDetailsService;
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.userDetailsService(userDetailsService);
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//			
//		http.authorizeRequests()
//		.antMatchers("/admin").hasRole("ADMIN")
//		.antMatchers("/").hasAnyRole("ADMIN","USER")
//		.antMatchers("/").permitAll()
//		.and().formLogin();
//	}
//	
//	
//
//}
