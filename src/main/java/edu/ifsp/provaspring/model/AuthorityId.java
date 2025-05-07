package edu.ifsp.provaspring.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AuthorityId implements Serializable {
    private String username;
    private String authority ;
}
