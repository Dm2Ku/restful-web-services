package com.hoho.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;

   /* {
        "token":
        "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJxd2VyIiwiZXhwIjoxNjcwOTMyODY1LCJpYXQiOjE2NzAzMjgwNjV9.WrJAHot_itg-2yP3ulgoSmmROuQ-sn7BH8s4DV4_k_rj0yJV6QpnmvJomL_eurNe-lRsVpzuAXkMjNsG3uvvgg"
    }
*/
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
