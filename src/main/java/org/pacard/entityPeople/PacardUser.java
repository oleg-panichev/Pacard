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
@Table(name="PacardUser")
public abstract class PacardUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userLogin;
    private String userPassword;
    private int userAccessLevel; // Admin, Doctor, Nurse

    private String userName;
    private String phoneNumber;
    private String notes;
}
