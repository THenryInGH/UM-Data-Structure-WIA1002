/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtest2_2022seta;

import java.util.EmptyStackException;

/**
 *
 * @author acer
 */
public class Stack {
    private java.util.ArrayList <Person> list = new java.util.ArrayList<>();
    //java.util is prefix where ArrayList class located, adding here let us no need to import the class ArrayList from java.util
    private String stack_name;

    public Stack() {
    }

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }
    
    public void push(Person o){
        list.add(o);
    }
    
    public void push(String name, int age){
        Person obj = new Person(name, age);
        list.add(obj);
    }
    
    public void push(String name, int age, String gender){
        Person obj = new Person(name, age, gender);
        list.add(obj);
    }
    public void push(String name, int age, String gender, String occupation){
        Person obj = new Person(name, age, gender, occupation);
        list.add(obj);
        String [] listOccupation = obj.getOccupation_list();
        for(int i=0; i<listOccupation.length; i++){
            if(listOccupation[i].equalsIgnoreCase(occupation)){
                obj.setFrontliner(true);
            }
        }
    }
    
    public Person pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Person temp = list.get(list.size()-1);
        list.remove(list.size()-1);
        return temp;
    }
    
    public Person peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(list.size()-1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public String toString(){
        return "Stack: "+list.toString();
        
    }
    
    public boolean search(Person o){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(o))
                return true;
        }
        return false;
    }
    
    public void displayStack(){
        System.out.println("----"+stack_name+"----");
        if(list.isEmpty()){
            System.out.println("Empty stack");
        }
        int counter = getSize();
        for(int i= counter; i>0; i--){
            System.out.print((i-1)+" ");
            Person obj = pop();
            System.out.print(obj.getName()+" ");
            System.out.print(obj.getAge()+" ");
            System.out.print(obj.getGender()+" ");
            if(obj.isFrontliner()){
                System.out.print("Frontliner\n");
            }
            else{
                System.out.print("Not frontliner\n");
            }
            
        }
        System.out.println("--------------------");
        
    }
}
