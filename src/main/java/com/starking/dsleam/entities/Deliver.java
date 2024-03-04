package com.starking.dsleam.entities;

import java.time.Instant;

import com.starking.dsleam.entities.enums.DeliverStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_deliver")
public class Deliver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	private String uri;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant moment;

	private DeliverStatus status;
	private String feedback;
	private Integer correctCount;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "offer_id"), @JoinColumn(name = "user_id") })
	private Enrollment enrollment;

	@ManyToOne
	@JoinColumn(name = "lesson_id")
	private Lesson lesson;
}