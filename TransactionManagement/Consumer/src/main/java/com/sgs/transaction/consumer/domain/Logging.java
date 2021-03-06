package com.sgs.transaction.consumer.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "logging")
public class Logging {

    @Id
    private String uuid;

    private String username;
    private String uuidRemote;
    private String stringToLog;

    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    private Logging(){}

    public Logging( String username, String uuidRemote, String stringToLog) {
        this.uuid = UUID.randomUUID().toString();
        this.username = username;
        this.uuidRemote = uuidRemote;
        this.stringToLog = stringToLog;
        this.time = new Date();
    }

    public String getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public String getUuidRemote() {
        return uuidRemote;
    }

    public String getStringToLog() {
        return stringToLog;
    }

    public Date getTime() {
        return time;
    }
}
