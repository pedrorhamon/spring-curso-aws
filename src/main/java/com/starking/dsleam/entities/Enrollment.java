package com.starking.dsleam.entities;

import java.io.Serializable;
import java.time.Instant;

import com.starking.dsleam.entities.pk.EnrollmentPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
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

	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
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
	
	public User getStudent() {
		return this.id.getUser();
	}
	
	public void setStudent(User user) {
		id.setUser(user);
	}
	
	public Offer getOffer() {
		return this.id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}
}
