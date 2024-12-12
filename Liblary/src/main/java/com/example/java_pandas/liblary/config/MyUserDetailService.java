package com.example.java_pandas.liblary.config;

import com.example.java_pandas.demostudentman.dto.UserPrincipal;
import com.example.java_pandas.demostudentman.entity.User;
import com.example.java_pandas.demostudentman.repository.UserRepository;
import com.example.java_pandas.liblary.entity.Librarian;
import com.example.java_pandas.liblary.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService  implements UserDetailsService {
    @Autowired
    private LibrarianRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Librarian> user = repository.findByEmail(username);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("User not found"+username);
        }
        return new UserPrincipal(user.get());

    }
}
