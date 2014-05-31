package org.pacard.entityPeople;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Oleg on 30.05.14.
 */
@Entity
@Table(name="DOCTOR")
public class Doctor extends PacardUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int doctorId;
    public String doctorName;
    public String doctorPost;
    public String phoneNumber;
    public String note;
}
