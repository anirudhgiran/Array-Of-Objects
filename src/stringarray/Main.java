package stringarray;

import java.util.Scanner;
import content.Student;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
       /* System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        
        char [] letters = new char [word.length()];
        for(int i = 0; i< word.length(); i++){
            letters[i] = word.charAt(i);
        }
        
        int u=letters.length-1;
        while(u>=0){
            
            System.out.println(letters[u]);
            
            u--;
        }
        
        
        int [][] a = new int[4][4];
        a[0][0]=1;
        a[1][0]=1;
        a[2][0]=1;
        
        a[0][1]=2;
        a[1][1]=2;
        a[2][1]=2;
        
        a[0][2]=3;
        a[1][2]=3;
        a[2][2]=3;
        
        System.out.println("Diagonal Elements:");
        
        for(int i=0; i<=3; i++){
        {for(int j=0; j<=3;j++)
                if(i==j)
                    System.out.println(a[i][j] + " ");}
        System.out.println(); } */
        
            
         
         Student[] list = new Student[3];
                 
                 
                 
                 
                 
                 
                 
                 
         Student s1 = new Student();
         
        /* System.out.println("Enter s1 name: ");
         String name = input.nextLine();*/
         s1.setName("Anirudh");
         
         /*System.out.println("Enter student id: ");
         int sid = input.nextInt();*/
         s1.setSid(1);
         
         
         Student s2 = new Student();
         Student s3 = new Student();
         
         s2.setName("Giran");
         s2.setSid(2);
         
         s3.setName("Saini");
         s3.setSid(3);
         
         
         for(int i =0; i<list.length; i++)
         {
              Student s6 = new Student();
         list[i]=s6;
    }
          
         /*
         list[0]= s1;
         list[1]=s2;
         list[2]=s3;*/
         
         
         
         for(int i =0; i<list.length; i++){
             System.out.print("\nName: " + list[i].getName());
             System.out.print("\tStudent ID: " + list[i].getSid());
         }
         
         
        /* 
         
         System.out.println("Name: " + s1.getName());
         System.out.println("Student ID: " + s1.getSid());*/
        

        System.out.println("Anirudh Giran");



    }
    
}
