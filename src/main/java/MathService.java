public class MathService {

    public int doubleNum(int num){
        return num+num;
    }

    public int factorial(int num) throws IllegalArgumentException{
        if(num == 0){
            return 1;
        } else if(num < 0){
            throw new IllegalArgumentException("Error: Expected a value greater than -1");
        }
        return num*factorial(num -1);
    }
}
