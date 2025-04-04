package com.task.workout.security.config;

/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


*/
//@Configuration
//@EnableWebSecurity
public class SecurityConfiguiration {  /*
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	
		http
		.authorizeHttpRequests((authorize) -> authorize
				.anyRequest().authenticated()
				)
		.httpBasic(withDefaults())
		.formLogin(withDefaults());
		return http.build();


	}
	@Bean
    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails user = User.withUsername("iguser")
            .password(encoder.encode("secret"))
            .roles("USER")
            .build();
        return new InMemoryUserDetailsManager(user);
    }
*/
}
