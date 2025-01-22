class Practical5{

public static void main(String[] args){
   //using for loop
   int op= factorial1(0);
   System.out.println(op);
   
   int opp= factorial1(1);
   System.out.println(opp);
   
   
   int oppp= factorial1(2);
   System.out.println(oppp);
   
   int opq= factorial1(3);
   System.out.println(opq);
   
   //using while loop
   int a= factorial2(0);
   System.out.println(a);

    int b= factorial2(1);
   System.out.println(b);

    int c= factorial2(2);
   System.out.println(c);

    int d= factorial2(3);
   System.out.println(d);
   
   //without looping 
   
    int f= factorial2(0);
   System.out.println(f);

    int g= factorial2(1);
   System.out.println(g);

    int h= factorial2(2);
   System.out.println(h);
   
   int e= factorial3(3);
   System.out.println(e);
   
   //for array sum 
   int[] numbers = {1, 2,3,5};
   int sum = getSum(numbers);
   System.out.println("Sum of array elements: " + sum);
   }

 static int factorial1(int number){
     if(number<2){
          return number;
          }
     else{
       int fact=1;
      for(;2<=number;){
          fact*=number--;
          }
       return fact;
       }
   }
   
   
 static int factorial2(int number){
     if(number<2){
          return number;
      }
       else{
       int f=1;
       while(1<number){
               f*=number--;
          }
           return f;}
           }
           
   
 static int factorial3(int number){
     if(number<2){
          return 1;
      }
       else{
            number*=factorial3(number-1);
  
           return number;
           }
         }  
           static int index=0;
     static int getSum(int[] numbers) {
    
   
        if (index >= numbers.length) {
            return 0; 
        }
        
        return numbers[index++] + getSum(numbers); 
    }
}

