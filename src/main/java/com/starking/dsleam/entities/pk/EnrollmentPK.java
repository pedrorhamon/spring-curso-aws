package com.starking.dsleam.entities.pk;

import java.io.Serializable;

import com.starking.dsleam.entities.Offer;
import com.starking.dsleam.entities.User;

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
public class EnrollmentPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	private User user;

	@EqualsAndHashCode.Include
	private Offer offer;

}
