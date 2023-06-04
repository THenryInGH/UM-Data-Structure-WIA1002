/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtest2_2022seta;

/**
 *
 * @author acer
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String [] occupation_list= {"doctor","nurse","teacher","police"};
    private boolean frontliner=false;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        for(int i=0; i<occupation_list.length; i++){
            if(occupation_list[i].equalsIgnoreCase(occupation)){
                setFrontliner(true);
            }
        }
    }

    public Person(String name, int age, String gender, String occupation, String[] occupation_list, boolean frontliner) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.occupation_list = occupation_list;
        this.frontliner = frontliner;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public String[] getOccupation_list() {
        return occupation_list;
    }

    public boolean isFrontliner() {
        return frontliner;
    }
    
    

    public void setAge(int age) {
        this.age = age;
    }

    public void setFrontliner(boolean frontliner) {
        this.frontliner = frontliner;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    
    
   
}
