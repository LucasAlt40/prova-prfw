package edu.ifsp.provaspring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "authorities")
public class Authority {
    @EmbeddedId AuthorityId id;
}

