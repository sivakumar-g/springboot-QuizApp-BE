package com.example.springQuiz.model.exam;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "category")

public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;

    private String title;

    private String description;

    @OneToMany(mappedBy="category",cascade=CascadeType.ALL)
    private Set<Quiz> quizzes = new HashSet<>();
    
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}


    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
