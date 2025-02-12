package com.project.myapirest.myapirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LineDfn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lineName;
    private String lineDesc;
    private String userDefined;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLineName() {
        return lineName;
    }
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
    public String getLineDesc() {
        return lineDesc;
    }
    public void setLineDesc(String lineDesc) {
        this.lineDesc = lineDesc;
    }
    public String getUserDefined() {
        return userDefined;
    }
    public void setUserDefined(String userDefined) {
        this.userDefined = userDefined;
    }

    
    

    

}
