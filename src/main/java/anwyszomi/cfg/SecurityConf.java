//package anwyszomi.cfg;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConf extends WebSecurityConfigurerAdapter {
//
//    public void configure(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.authorizeRequests().antMatchers("/mysql/**").permitAll().antMatchers("/")
//                .hasRole("ADMIN").and().httpBasic().and().csrf().disable();
//
//        httpSecurity.headers().frameOptions().disable();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth){
//        auth.inMemoryAuthentication().withUser("admin").password("admin").roles()
//    }
//}
