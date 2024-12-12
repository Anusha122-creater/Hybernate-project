package com.Telecommunication.entity;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Setter;
import javax.persistence.Getter;
import javax.persistence.NoArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
public class BillingCycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billingCycleId;

    @ManyToOne
    @JoinColumn(name = "subscriberId", nullable = false)
    private Subscriber subscriber;
    private Date billingDate;
    private Double amount;
		
	public void setBillingCycleId(Integer billingCycleId) {
		this.billingCycleId = billingCycleId;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	
    @Override
    public String toString() {
        return "BillingCycle{" +
                "billingCycleId=" + billingCycleId +
                ", subscriber=" + subscriber +
                ", billingDate=" + billingDate +
                ", amount=" + amount +
                '}';
    }
}
