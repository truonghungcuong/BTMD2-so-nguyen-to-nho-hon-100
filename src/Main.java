public class Main {

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100: ");
        for (int number = 2; number <100; number ++){
            if (number == 2){
                System.out.println(number);
            }
            else{
                boolean isPrime = true;
                for(int i = 2; i <number;i++){
                    if (number % i == 0 ){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.println(number);
                }
            }
        }
    }
}

