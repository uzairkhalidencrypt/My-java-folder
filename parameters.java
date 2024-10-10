public class parameters{
    //method
    static void checkAge(int age){
        if(age > 18){
            System.out.print("old enough to vote");
        }
        else {
            System.out.println("not old enough to vote");
        }
    }
    public static void  main(String[] args){
        checkAge(20);
    }
}