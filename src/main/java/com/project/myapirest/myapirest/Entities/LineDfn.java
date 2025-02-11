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
    public void setId(Long id) {
        this.id = id;
    }
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
    public void setLineDesc(String lineDesc) {
        this.lineDesc = lineDesc;
    }
    public void setUserDefined(String userDefined) {
        this.userDefined = userDefined;
    }

    

}
