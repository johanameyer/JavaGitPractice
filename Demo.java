import java.util.Scanner;

public class Demo
{
    
    public static void main(String[] args)
    {
      
        
        Scanner input = new Scanner(System.in);
        
        //ask the user to choice 1 or 2
        
        System.out.println("Pick 1 or 2");
        
        //get user input
        
        int choice = input.nextInt();
        
        if(choice == 1)
        {
            
           System.out.println("You chose Kiwi!");
           
            HouseCat cat = new CatOne();
            cat.introduce();
            cat.makeNoise();
        }
        
        else 
        {
            System.out.println("You chose George!");
            
            HouseCat cat = new CatTwo();
            cat.introduce();
            cat.makeNoise();
        }   
        
        input.close();
       
    }

}

