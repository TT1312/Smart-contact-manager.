package com.smartcontactmanager.configuration;


import org.springframework.context.annotation.Bean; 

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.smartcontactmanager.services.UserInfoUserDetailsService;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableMethodSecurity
public class securityConfig {

    @Bean
    PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

    @Bean
    // Authorization
    UserDetailsService userDetailsService() {
		
    	
    	/* There are two ways to define users-->   
    	 		1. hardcore
    			2. get user data from database
    	*/
    	
    	
    	// 1. Hardcore--->
//    	UserDetails tushar = User.builder().username("tushar").password(passwordEncoder().encode("tushar")).roles("ADMIN").build();
//    	UserDetails sagar = User.builder().username("sagar").password(passwordEncoder().encode("sagar")).roles("NORMAL").build();
//    	
//    	return new InMemoryUserDetailsManager(tushar,sagar);
    	
    	
    	
    	
    	
    	// Get user data from database
    	
    	return new UserInfoUserDetailsService();
    	
    	
    }


    // Authantication
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/contact/home", "/contact/adduser").permitAll()
                .anyRequest().authenticated()
                .and().formLogin(withDefaults());
    	
		return http.build();
    			
    	
    }
    
    @Bean
    AuthenticationProvider authenticationProvider() {
    	DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
    	authenticationProvider.setUserDetailsService(userDetailsService());
    	authenticationProvider.setPasswordEncoder(passwordEncoder());
    	return authenticationProvider;
    }
    

}
