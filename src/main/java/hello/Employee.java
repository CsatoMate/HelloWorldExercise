package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    private String name;

    private String getName(){
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Employee: id= " + id + ", name= " + name;
    }
}
