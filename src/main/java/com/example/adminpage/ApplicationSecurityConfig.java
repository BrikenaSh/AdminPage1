package com.example.adminpage;

import com.example.adminpage.services.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
@Configuration
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(
                        "/login",
                        "/resources/**",
                        "/css/**",
                        "/fonts/**",
                        "/img/**").permitAll()

                .antMatchers(
                        "/register",
                        "/resources/**",
                        "/css/**",
                        "/fonts/**",
                        "/img/**", "/js/**").permitAll()
                .antMatchers("/users/addNew").permitAll()

                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .and()
                .logout().invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login").permitAll();

    }


/*we need to create a PasswordEncoder bean to handle an encoded password*/

   @Bean
   public PasswordEncoder passwordEncoder() {
       return NoOpPasswordEncoder.getInstance();
   }



/*here we will create a BCryptPasswordEncoder bean */
/*bcrypt is a password-hashing and adaptive function to protect against
rainbow table attacks. The iteration count can be increased to make it slower, so it remains resistant to brute-force search attacks even with increasing computation power*/

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();

    }


     @Autowired
    private MyUserDetailsService userDetailsService;

/*we need to create a bean to return an authentication provider*/

@Bean
    public AuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

    provider.setUserDetailsService(userDetailsService);
    provider.setPasswordEncoder(bCryptPasswordEncoder());
    return provider;

}

/*instead of using only passwordEncoder we need to use bCryptPasswordEncoder*/
/*before we save the password, we need to encode it*/



}
