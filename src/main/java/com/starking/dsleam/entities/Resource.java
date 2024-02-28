package com.starking.dsleam.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.starking.dsleam.entities.enums.ResourceType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author pedroRhamon
 */
@Entity
@Table(name = "tb_resource")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Resource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	private String title;
	
	private String description;
	
	private Integer position;
	
	private String imgUri;
	
	private ResourceType type;
	
	@ManyToOne
	@JoinColumn(name = "offer_id")
	private Offer offer;
	
	@OneToMany(mappedBy = "resource")
	private List<Section> sections = new ArrayList<>();

}
