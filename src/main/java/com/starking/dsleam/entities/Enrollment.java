package com.starking.dsleam.entities;

import java.io.Serializable;
import java.time.Instant;

import com.starking.dsleam.entities.pk.EnrollmentPK;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author pedroRhamon
 */

@Entity
@Table(name = "tb_enrollment")
@Getter
@Setter
@NoArgsConstructor
public class Enrollment implements Serializable {

	private static final long serialVersionUID = 1L;

	private EnrollmentPK id = new EnrollmentPK();
	private Instant enrollMoment;
	private Instant refundMoment;
	private boolean available;
	private boolean onlyUpdate;

	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available,
			boolean onlyUpdate) {
		this.id.setUser(user);
		this.id.setOffer(offer);
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.available = available;
		this.onlyUpdate = onlyUpdate;
	}

}
