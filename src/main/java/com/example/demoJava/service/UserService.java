package com.example.demoJava.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demoJava.dao.UsuarioDao;
import com.example.demoJava.models.Usuario;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	UsuarioDao userDao;

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		final Usuario user = userDao.findByNombre(username);
		final List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ADMIN"));
		final UserDetails userDetail = new User(user.getNombre(), user.getClave(), authorities);

		return userDetail;
	}

}
