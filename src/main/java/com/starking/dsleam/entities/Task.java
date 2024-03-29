package com.starking.dsleam.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author pedroRhamon
 */

@Entity
@Table(name = "tb_task")
@Getter
@Setter
@NoArgsConstructor
public class Task extends Lesson {

	private static final long serialVersionUID = 1L;
	
	private String description;
	
	private Integer questionCount;

	private Integer approvalCount;
	
	private Double weight;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dueDate;

	public Task(Long id, String title, Integer position, Section section, String description, Integer questionCount,
			Integer approvalCount, Double weight, Instant dueDate) {
		super(id, title, position, section);
		this.description = description;
		this.questionCount = questionCount;
		this.approvalCount = approvalCount;
		this.weight = weight;
		this.dueDate = dueDate;
	}
}
