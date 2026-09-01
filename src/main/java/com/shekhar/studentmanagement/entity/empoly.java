package com.shekhar.studentmanagement.entity;
import jakarta.persistence.*;
@Entity
@Table (name = "empoly")
public class empoly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

    private String Name;
    private String Company;
    private String Adderss;


    public Long getid(){
        return id;
    }
 public void setid(Long id){
    this.id = id;
 }
//Name getAndset
 public String getName(){
    return Name;
 }
public void setName(String Name){
    this.Name = Name;

}
 //Class getAndSet
 public String getCompany(){
    return Company;
 } 
 public void setCompany(String Company){
    this.Company = Company;
 }

 // Adderss getAndSet
 public String getAdd(){
    return Adderss;
 }
 public void setAdd(String Adderss){
    this.Adderss = Adderss;
 }

}
