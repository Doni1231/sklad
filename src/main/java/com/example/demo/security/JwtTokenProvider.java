package com.example.demo.security;


import com.example.demo.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {
    @Value("${app.jwtSecret}")
    private String secretKey;

    @Value("${app.jwtExpirationInMs}")
    private Long expireTime;

    public String generateToken(User user) {
        Date durationLife = new Date(new Date().getTime() + expireTime);
        return Jwts.builder()
                .setSubject(user.getId().toString())
                .claim("firstName", user.getFirstName())
                .claim("lastName", user.getLastName())
                .setIssuedAt(new Date())
                .setExpiration(durationLife)
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }
}
