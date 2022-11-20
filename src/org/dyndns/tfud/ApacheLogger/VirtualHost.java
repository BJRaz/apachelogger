package org.dyndns.tfud.ApacheLogger;
/*
 * VirtualHost.java
 *
 * Created on 24. september 2004, 21:23
 */

import java.util.*;
/**
 *
 * @author  bjr
 */
public class VirtualHost {
    private String host;
    private Vector visitors;
    
    /** Creates a new instance of VirtualHost */
    public VirtualHost(String host) {
        this.host = host;
        visitors = new Vector();
        
    }
    public void setHost(String host) {
        this.host = host;
    }
    
    public String getHost() {
        return this.host;
    }
    
    public void addVisitor(String match) {
        Visitor temp = new Visitor(match);
        if(!visitors.contains(temp)) {
            visitors.add(temp);
        }
    }
    
    public void clearVisitors() {
        visitors.clear();
    }
    
    public String[] getVisitors() {        
        String[] v = new String[visitors.size()];
        for(int i=0;i<visitors.size();i++)
            v[i] = visitors.get(i).toString();
        return v;
    }
    
    public boolean equals(Object obj) {
        VirtualHost temp = (VirtualHost)obj;
        if(temp.getHost().equals(this.getHost()))
            return true;
        return false;
    }
    public String toString() {
        return "(" + visitors.size() + ") " + this.host;
    }
    
    
}
