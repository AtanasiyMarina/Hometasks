/**
 * Created by on 2018-03-18.
 */
public class AtanasiiHomeWork {

    public static void main(String[] args){
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i+3;
        }

        for(int i = 0; i < numbers.length-1; i++){
            int number1 = numbers[i];
            int number2 = numbers[i+1];
            int sum =  number1 + number2;
            if(sum>10){
                System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum);
            }
        }




    }


}
