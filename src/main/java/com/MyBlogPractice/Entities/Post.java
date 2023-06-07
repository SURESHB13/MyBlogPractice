package com.MyBlogPractice.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts",uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  long id;
@Column( name = "title",nullable = false)
private String title;
@Column( name = "content",nullable = false)
private String content;
    @Column( name = "description",nullable = false)
private String description;
}
