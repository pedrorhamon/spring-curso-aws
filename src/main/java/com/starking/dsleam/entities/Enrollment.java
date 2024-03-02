package com.starking.dsleam.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
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
public class Enrollment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Instant enrollMoment;
	private Instant refundMoment;
	private boolean available = true;
	private boolean onlyUpdate;
	

}
