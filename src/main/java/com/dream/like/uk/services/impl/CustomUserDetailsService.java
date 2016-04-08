package com.dream.like.uk.services.impl;
import com.dream.like.uk.domain.entities.*;
import com.dream.like.uk.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
/**
 * Created by Stacy on 4/6/16.
 */
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        UserEntity user = userService.getUserByMail(email);
        if(user == null){
            throw new UsernameNotFoundException("Username was not found");
        }
        boolean enabled = true;
        if (!user.isActive())
            enabled = false;
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
                enabled, true, true, true, getGrantedAuthorities(user));
    }


    private List<GrantedAuthority> getGrantedAuthorities(UserEntity user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (PermissionEntity perm:user.getRoleEntity().getPermissions()){
            authorities.add(new SimpleGrantedAuthority(perm.getName().toString()));
        }
        return authorities;
    }
}