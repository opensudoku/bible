/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensudoku.web.bible;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mark
 */
@Stateless
public class ScheduleFacade extends AbstractFacade<Schedule> {
    @PersistenceContext(unitName = "com.opensudoku.web_bible_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ScheduleFacade() {
        super(Schedule.class);
    }
    
}
