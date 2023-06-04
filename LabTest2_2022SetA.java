/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtest2_2022seta;

/**
 *
 * @author acer
 */
public class LabTest2_2022SetA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack raw = new Stack("Raw list");
        Stack frontliners = new Stack("Frontliners");
        Stack others = new Stack("Others");
        Stack priority = new Stack("Vaccine Priority List");
        
        raw.push("ali",32,"m","doctor");
        raw.push("lisa",29,"f","nurse");
        raw.push("tanka", 41);
        raw.push("ahmad", 18, "m", "developer");
        raw.push("maria", 20,"f","accountant");
        raw.push("chong",70,"m","lawyer");
        raw.push("raju", 55,"m","police");
        raw.push("alex", 16,"f","business man");
        Person katie = new Person("katie",36,"f","teacher");
        raw.push(katie);
        
        int counter = raw.getSize();
        for(int i=0; i<counter; i++){
            Person person = raw.pop();
            if(person.isFrontliner()){
                frontliners.push(person);
            }
            else{
                others.push(person);
            }
        }
        
        
        priority = sorting(frontliners,others);
        
        System.out.println("~~~~~~Sort into Vaccine list~~~~~~");
        raw.displayStack();
        frontliners.displayStack();
        others.displayStack();
        priority.displayStack();
    }
    
    public static Stack sorting(Stack frontliners, Stack others){
        Stack sort = new Stack();
        Stack result = new Stack();
        
        
        result.push(others.pop());
        while(!others.isEmpty()){
            while(!result.isEmpty() && others.peek().getAge()<result.peek().getAge() ){
                sort.push(result.pop());
            }
            result.push(others.pop());
            while(!sort.isEmpty()){
                result.push(sort.pop());
            }
        }
        
        result.push(frontliners.pop());
        while(!frontliners.isEmpty()){
            while(!result.isEmpty() && frontliners.peek().getAge()<result.peek().getAge()&& result.peek().isFrontliner()){
                sort.push(result.pop());
            }
            result.push(frontliners.pop());
            while(!sort.isEmpty()){
                result.push(sort.pop());
            }
        }
        return result;
    }
    
}
