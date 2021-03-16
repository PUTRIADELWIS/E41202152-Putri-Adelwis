
package main;

public class tugas_ManagingPeople {
    public static void main(String[] args) {
        
        tugas_PersonNew p1 = new tugas_PersonNew("Putri", 19);
        
        tugas_PersonNew p2 = new tugas_PersonNew("Khan", 18);
        
        
        if(p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
        
    }
}

