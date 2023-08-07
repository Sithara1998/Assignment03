import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class assignment03 {
    private static final Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.print("Enter your name     :");
        String name =scanner.nextLine();
        lable1: {
            if (name.length()==0 || (name.strip()).length()==0) {
                System.out.println("\033[31mInvalid Name\033[0m "); 
                break lable1;
                }
            else System.out.print("Enter your age:");

            int age = scanner.nextInt();
            if ((age>=10 && age<=18)==false) {
                System.out.println("\033[31mInvalid Age\033[0m ");
                break lable1;
            }
           
            else System.out.print("Enter your subject 1 :");
            
            String subject1 =scanner.next();
                                // if (subject1.length()==0 || (subject1.strip()).length()==0 ) {
                                //     System.out.println("\033[31mInvalid Subject\033[0m "); 
                                //     break lable1;
                                // }
            if (subject1.startsWith("SE-")) System.out.print("Enter your marks 1 : ");
            else {
                System.out.println("\033[31mInvalid Subject\033[0m "); 
                break lable1;
            }

            double mark1 = scanner.nextDouble();
            if (mark1<0 && mark1>100) {
                System.out.println("\033[31mInvalid Age\033[0m ");
                break lable1;
            }
            
            else System.out.print("Enter your subject 2:");

            String subject2 =scanner.next();

            if (subject2.startsWith("SE-")) System.out.print("Enter your marks 2 : ");
            else System.out.println("\033[31mInvalid Subject\033[0m "); 

            double mark2 = scanner.nextDouble();
            if (mark2<0 && mark2>100) {
                System.out.println("\033[31mInvalid Age\033[0m ");
                break lable1;
            }

            else System.out.print("Enter your subject 3:");

            String subject3 =scanner.next();

            if (subject3.startsWith("SE-")) System.out.print("Enter your marks 3: ");
            else {
                System.out.println("\033[31mInvalid Subject\033[0m "); 
                break lable1;
            }

            double mark3 = scanner.nextDouble();
            if (mark3<0 && mark3>100) {
                System.out.println("\033[31mInvalid Age\033[0m ");
                break lable1;
              
            }
            
            double total = mark1+mark2+mark3; 
            double avg = total/3;

            
            String status;
            if (avg >= 75.0) status = "\033[32mCredit Pass\033[0m";
            else if (avg<75 && avg>=55) status = "\033[31mPass\033[0m";
            else status = "\033[34mFail\033[0m";

           
            String blueBolt = "\033[34m\033[1m";
            String reset = "\033[0m";

            
            System.out.printf("-------------------------------------\n"); 
            System.out.printf("|Name   :%2$s%1$-27s%3$s|\n", name.toUpperCase(), blueBolt, reset);  
            System.out.printf("|Age    :%3$s%1$s %2$s%4$18s |\n", age,"Years Old" ,blueBolt,reset);      
            System.out.printf("|Status :%-36s|\n", status);         
            System.out.printf("|Total  :%-17sAvg:%.2f |\n", total,avg);   
            System.out.printf("-------------------------------------\n"); 
            System.out.printf("|  SUBJECT  |  MARKS   |   STATUS   |\n");
            System.out.printf("-------------------------------------\n"); 
            System.out.printf("| SE-%03d   | %-11s| %-11s|\n",Integer.valueOf(subject1.substring(3)),mark1,status);
                                  
        }
                        
    }
    
}

