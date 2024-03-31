import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class person1 extends employee1{
    void display(){
        System.out.println("Enter your name");
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        System.out.println("Name is "+n);
    }
    void age(LocalDate bd){
        LocalDate today=LocalDate.now();       
        int year=Period.between(bd,today).getYears();
        System.out.println("Today's date is "+today);
        System.out.println("Your birthdate is "+bd);
        System.out.println(year+" years completed");
    }
    public static void main(String args[]){
        person1 s1=new person1();
        employee1 e1=new employee1();
        e1.displaydetails();
        s1.display();
        System.out.println();
        System.out.println("Enter your birthdate");
        Scanner s=new Scanner(System.in);
        String date=s.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDate bd = LocalDate.parse(date, formatter);           
        s1.age(bd);
    }
}