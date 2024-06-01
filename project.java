import java.util.*;
class project{
    public static void main(String args[]){
        System.out.println("Hello welcome to the food app");
        System.out.print("Please create a password:");
        Scanner sc=new Scanner(System.in);
        String pass=sc.next();
        System.out.println("Your password is now: "+pass);
        System.out.println("Please enter your password");
        String pass1=sc.next();

        while(!pass1.equals(pass)){
            System.out.println("This is not the right password please try again");
            pass1=sc.next();
        }
        System.out.println("Access Granted");    
        System.out.println("Are you hungry Yes or No :");
        String ans=sc.next();

        if(ans.equals("yes")){
            System.out.println("choose what you want to eat between pizza burger and fish");
            String ans2=sc.next();

            while(!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")){
                System.out.println("Sorry we do not have it would you like between pizza,burger and fish");
                ans2=sc.next();
            }
            if (ans2.equals("pizza")||ans2.equals("burger")||ans2.equals("fish")){
                System.out.println("Do you want something to drink? Yes or No :");
                String ans3=sc.next();

                while(!ans3.equals("Yes") && !ans3.equals("No")){
                    System.out.println("Wrong command please try again!");
                    ans3=sc.next();
                }
                if (ans3.equals("Yes")){
                    System.out.println("What would you like to drink coke or juice? :");
                    String ans4=sc.next();

                    while(!ans4.equals("coke") && !ans4.equals("juice")){
                        System.out.println("Sorry we don't have it what would you like between coke and juice: ");
                        ans4=sc.next();
                    }
                    if(ans4.equals("coke")|| ans4.equals("juice")){
                        System.out.println("Great you have ordered "+ans2+" and "+ans4+".");
                    }
                
                    System.out.println("please confirm your Password: ");
                    pass1=sc.next();

                    while(!pass1.equals(pass)){
                        System.out.println("This is not the right password please try again");
                        pass1=sc.next();
                    }
                    System.out.println("Thank you.Your order is on it's way!");
                }else{
                    System.out.println("You have ordered"+ans2);
                
                System.out.println("please confirm your Password: ");
                    pass1=sc.next();

                    while(!pass1.equals(pass)){
                        System.out.println("This is not the right password please try again");
                        pass1=sc.next();
            }
                }

            }

        }
        else{
            System.out.println("Alright have a good day!");
        }

    }
}