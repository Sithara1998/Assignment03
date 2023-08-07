import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Demo9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your name      :");
        String name =scanner.nextLine();
        label1: {
            if (name.length()==0 || (name.strip()).length()==0) {
                System.out.println("\033[31mInvalid Name\033[0m "); 
                break label1;
                }
            else System.out.print("Enter your age       :");
            int age = scanner.nextInt();
            scanner.nextLine();


            if ((age>=10 && age<=18)==false) {
                System.out.println("\033[31mInvalid Age\033[0m ");
                break label1;
                }
           
            else System.out.print("Enter subject 1      :");
            
            String subject1 =scanner.nextLine();
            if (subject1.length()==0 || (subject1.strip()).length()==0 ) {
                System.out.println("\033[31mInvalid Subject\033[0m "); 
                break label1;
                }
            else if (subject1.startsWith("SE-")) System.out.printf("Enter marks for %s :",subject1);
            else {
                System.out.println("\033[31mInvalid Subject\033[0m "); 
                break label1;
            }

            double mark1 = scanner.nextDouble();
            scanner.nextLine();

            if (mark1<0 && mark1>100) {
                System.out.println("\033[31mInvalid Mark\033[0m ");
                break label1;
            }
            
            else System.out.print("Enter subject 2      :");

            String subject2 =scanner.nextLine();

            if (subject2.length()==0 || (subject2.strip()).length()==0 || subject2.equalsIgnoreCase(subject1)){
                System.out.println("\033[31mInvalid Subject\033[0m "); 
                break label1;
            }
            else if (subject2.startsWith("SE-")) System.out.printf("Enter marks for %s :",subject2);
            else System.out.println("\033[31mInvalid Subject\033[0m "); 

            double mark2 = scanner.nextDouble();
            
            if (mark2<0 && mark2>100) {
                System.out.println("\033[31mInvalid Mark\033[0m ");
                break label1;
            }
            else System.out.print("Enter subject 3      :");

            String subject3 =scanner.next();

            if (subject3.length()==0 || (subject3.strip()).length()==0 || subject3.equalsIgnoreCase(subject1)||subject3.equalsIgnoreCase(subject2) ) {
                System.out.println("\033[31mInvalid Subject\033[0m "); 
                break label1;
            }
            else if (subject3.startsWith("SE-")) System.out.printf("Enter marks for %s :",subject3);
            else {
                System.out.println("\033[31mInvalid Subject\033[0m "); 
                break label1;
            }

            double mark3 = scanner.nextDouble();
            scanner.nextLine();
            
            if (mark3<0 && mark3>100) {
                System.out.println("\033[31mInvalid Age\033[0m ");
                break label1; 
            }
            
            double total = mark1 + mark2 + mark3; 
            double avg = total/3;

            
            String status;
            if (avg >= 75) status = "\033[34mDistinguished Pass\033[0m";
            else if (avg<75 && avg>=65) status = "\033[32mPass\033[0m";
            else if (avg<65 && avg>=55)status = "\033[33mPass\033[0m";
            else status = "\033[31mFail\033[0m";

           
            String blueBolt = "\033[34m\033[1m";
            String bolt = "\033[1m";
            String reset = "\033[0m";

            String line1  = "+-----------------------------------+\n";
            String record1= "| SE-%03d    | %-9s| %s       |\n";
            
            System.out.printf(line1); 
            System.out.printf("|Name   :%2$s%1$-27s%3$s|\n", name.toUpperCase(), blueBolt, reset);  
            System.out.printf("|Age    :%3$s%1$s %2$s%4$18s |\n", age,"Years Old" ,blueBolt,reset);      
            System.out.printf("|Status :\033[1m%-36s|\033[0m\n", status);         
            System.out.printf("|Total  :%3$s%-17s%4$sAvg:%3$s%.2f%4$s |\n", total,avg,blueBolt,reset);   
            System.out.printf(line1); 
            System.out.printf("|  %1$sSUBJECT%2$s  |  %1$sMARKS%2$s   |   %1$sSTATUS%2$s   |\n",bolt,reset);
            System.out.printf(line1); 
            System.out.printf(record1,Integer.valueOf(subject1.substring(3)),mark1,status);
            System.out.printf(record1,Integer.valueOf(subject2.substring(3)),mark2,status);
            System.out.printf(record1,Integer.valueOf(subject3.substring(3)),mark3,status);
            System.out.printf(line1); 
                                 
        }
                        
    }
    
}

