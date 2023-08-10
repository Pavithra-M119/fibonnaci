public class Main {
    public static void main(String[] args) {//static is used when object is not necessary
        int inputNumber = 10;
        Fibonacciseries fibonaccifinder = new Fibonacciseries();//classname object = new classname();
        System.out.println(fibonaccifinder.fibonacci(inputNumber));//calling by method

    }
}
class Fibonacciseries
{
    int fibonacci(int n)//int n
    {
        if(n<=1)
        {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    }
