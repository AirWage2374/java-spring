@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/api/public").permitAll()
                .anyRequest().authenticated() 
            .and()
            .oauth2Login(); 

        http.oauth2ResourceServer().jwt();
    }
}
