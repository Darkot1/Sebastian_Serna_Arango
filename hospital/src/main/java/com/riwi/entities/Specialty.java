package com.riwi.entities;

public class Specialty {

    private int idSpecialty;
    private String name;
    private String description;

    public Specialty(){}

    public Specialty(int idSpecialty, String name, String description){
        this.idSpecialty = idSpecialty;
        this.name = name;
        this.description = description;
    }

    public int getIdSpecialty() {
        return this.idSpecialty;
    }

   public String getName() {
       return this.name;
   }

   public String getDescription() {
       return this.description;
   }

   public void setIdSpecialty(int idSpecialty) {
       this.idSpecialty = idSpecialty;
   }

   public void setName(String name) {
       this.name = name;
   }

   public void setDescription(String description) {
       this.description = description;
   }

@Override
public String toString() {
    return "Specialty [idSpecialty=" + this.idSpecialty + ", name=" + this.name + ", description=" + this.description + "]";
}


   




}
