import java.util.Scanner;

public class Hail{
   public static void main(String[] args){
      
      Scanner scan= new Scanner(System.in);
      System.out.print("Enter a positive hailstone starting value: ");
      int num = scan.nextInt();//Enter starting value
      
      if (num>0){
         System.out.println(num);
      
         int length= 0; //length of the sequence
         int last= 0; //last value of num in sequence
         int max= 1; /*largest value in sequence
                  (Initialize to 1 to account for a starting value of 1)*/
      
         for (int n=0; num>1;n++){
         
            last=num;
            if (last>max){//Compares max with each last value in sequence to find largest value
                  max=last;
               }
         
            if (num%2==0){//Even number
                  num= num/2;
               }
               
            else {
               num= num*3+1;//Odd number
               }
            
            System.out.println(num);
            length++;
         }
      
         length=length+1;// Adds the starting value to sequence length
         System.out.println("Largest value in sequence: "+max);
         System.out.println("Length of sequence: "+ length);
      
      }
   }
}