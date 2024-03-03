package com.starking.dsleam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author pedroRhamon
 */

@Entity
@Table(name = "tb_content")
@Getter
@Setter
@NoArgsConstructor
public class Content extends Lesson {

	private static final long serialVersionUID = 1L;

	private String textContent;

	private String videoUri;

	public Content(Long id, String title, Integer position, Section section, String textContent, String videoUri) {
		super(id, title, position, section);
		this.textContent = textContent;
		this.videoUri = videoUri;
	}
}
