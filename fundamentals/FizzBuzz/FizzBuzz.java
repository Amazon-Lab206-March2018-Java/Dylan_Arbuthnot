class FizzBuzz {
    public String fizzBuzz(int number) {
        String str1 = Integer.toString(number);
        if(number % 3 == 0 && number % 5 == 0) {
            str1 = "FizzBuzz";
        } else if(number % 3 == 0) {
            str1 = "Fizz";
        } else if(number % 5 == 0) {
            str1 = "Buzz";
        } else {
            return str1;
        }
        return str1;
    }
}