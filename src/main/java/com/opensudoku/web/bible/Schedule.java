/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensudoku.web.bible;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mark
 */
@Entity
@Table(name = "schedule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Schedule.findAll", query = "SELECT s FROM Schedule s"),
    @NamedQuery(name = "Schedule.findById", query = "SELECT s FROM Schedule s WHERE s.id = :id"),
    @NamedQuery(name = "Schedule.findByDate", query = "SELECT s FROM Schedule s WHERE s.date = :date"),
    @NamedQuery(name = "Schedule.findByWeeknum", query = "SELECT s FROM Schedule s WHERE s.weeknum = :weeknum"),
    @NamedQuery(name = "Schedule.findByNt", query = "SELECT s FROM Schedule s WHERE s.nt = :nt"),
    @NamedQuery(name = "Schedule.findByNtCh", query = "SELECT s FROM Schedule s WHERE s.ntCh = :ntCh"),
    @NamedQuery(name = "Schedule.findByOt", query = "SELECT s FROM Schedule s WHERE s.ot = :ot"),
    @NamedQuery(name = "Schedule.findByOtCh", query = "SELECT s FROM Schedule s WHERE s.otCh = :otCh")})
public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEEKNUM")
    private int weeknum;
    @Size(max = 36)
    @Column(name = "NT")
    private String nt;
    @Size(max = 32)
    @Column(name = "NT_CH")
    private String ntCh;
    @Size(max = 32)
    @Column(name = "OT")
    private String ot;
    @Size(max = 32)
    @Column(name = "OT_CH")
    private String otCh;

    public Schedule() {
    }

    public Schedule(Integer id) {
        this.id = id;
    }

    public Schedule(Integer id, Date date, int weeknum) {
        this.id = id;
        this.date = date;
        this.weeknum = weeknum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(int weeknum) {
        this.weeknum = weeknum;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public String getNtCh() {
        return ntCh;
    }

    public void setNtCh(String ntCh) {
        this.ntCh = ntCh;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public String getOtCh() {
        return otCh;
    }

    public void setOtCh(String otCh) {
        this.otCh = otCh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Schedule)) {
            return false;
        }
        Schedule other = (Schedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.opensudoku.web.bible.Schedule[ id=" + id + " ]";
    }
    
}
