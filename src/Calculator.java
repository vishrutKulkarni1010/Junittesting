public class Calculator {
    int sum(int a, int b){
        return a+b;
    }

    int diff(int a,int b){
        return a-b;
    }

    int multiply(int a,int b){
        return a*b;
    }

    int divide(int a,int b) throws Exception{
        if(b==0){
                throw new Exception();
        }
        return a/b;
    }

}