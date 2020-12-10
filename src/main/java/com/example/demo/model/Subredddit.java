package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Subredddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @NotBlank(message ="Name is Required.")
    private String name;
//    @NotBlank(message = "Description is required.")
    private String descrption;
    @OneToMany(fetch = FetchType.LAZY)
//    private List<Post> posts;
//    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
