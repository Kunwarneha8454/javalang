import java.util.*;

// public class loops {
    public static void main(String args[]){
        int counter = 0;
        while(counter<=10){
            System.out.println("hello world");
            counter++;
        }
       System.out.println("done");
    }



// PROBLEM 2:-
public class loops{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}

// PROBLEM 3:-
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n =" + " ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {

            sum = sum + i;
            i++;

        }
        System.out.println(sum);

    }
}

// PROBLEM 4:- 
public class loops{
    public static void main(String[] args){
        int i=1;
        while(i<=4){

            System.out.println("****");
            i++;
        }
    }
}

// PROBLEM 5:- REVERSE OF A NUMBER
public class loops{
    public static void main(String[] args){
        int num = 10987;
        while(num>0){
            int lastdigit= num%10;
            System.out.print(lastdigit);
            num=num/10;
        }
    }
}

// PROBLEM 5 :- PRIME NUMBER OR NOT;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("prime number");
        }
        boolean isPrime = true;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }

        
    }
}

// PROBLEM :-6
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum =0;
        int oddSum = 0;

        do{
            System.out.print("enter the number:");
            number = sc.nextInt();

            if(number % 2 == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.println("Do you want to continue ? Press 1 for yes or 0 for no.");
            choice = sc.nextInt();
        

        }while(choice==1);
        System.out.println("sum for even numbers:" + evenSum);
        System.out.println("sum for odd numbers:"+ oddSum);
    }
}