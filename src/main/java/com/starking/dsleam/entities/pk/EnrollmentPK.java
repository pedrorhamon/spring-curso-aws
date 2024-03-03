package com.starking.dsleam.entities.pk;

import java.io.Serializable;

import com.starking.dsleam.entities.Offer;
import com.starking.dsleam.entities.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author pedroRhamon
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class EnrollmentPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@EqualsAndHashCode.Include
	private User user;

	@ManyToOne
	@JoinColumn(name = "offer_id")
	@EqualsAndHashCode.Include
	private Offer offer;

}
