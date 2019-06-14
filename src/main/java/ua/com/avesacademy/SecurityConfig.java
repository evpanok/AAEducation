package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception{

        auth.userDetailsService(userDetailsService)
                .passwordEncoder(getShaPasswordEncoder());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

       http
               .csrf().disable()
               .authorizeRequests()
               .antMatchers("/","pageTonirovka","pageWindowFilm","/tonirovka/{page.name}","/windowFilm/{page.name}",
                       "pagePPF","/ppf/{page.name}","pageDeteyling","/deteyling/{page.name}","pageMarketing","/marketing/{page.name}","pageOneC","oneC/{page.name}").hasAnyRole("USER","ADMIN")
                .antMatchers("/admin","/TonirovkaList","/createTonirovka","/userList","/createUser","/WindowFilmList",
                        "createPPF","PPFList","createDeteyling","DeteylingList","MarketingList","createMarketing","OneCList", "createOneC").hasRole("ADMIN")
                .and()
            .exceptionHandling().accessDeniedPage("/unauthorized")
                .and()
            .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/j_spring_security_check")
                .failureUrl("/login?error")
                .usernameParameter("j_login")
                .passwordParameter("j_password")
                .permitAll()
                .and()
            .logout()
                .permitAll()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .invalidateHttpSession(true);
    }

    private ShaPasswordEncoder getShaPasswordEncoder(){
        return new ShaPasswordEncoder();
    }
}
