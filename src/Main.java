public class Main {
    public static void main(String[] args) {
        boolean result = shouldWakeUp(true,4);
        System.out.println(result);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay){
        if (hourOfTheDay < 0 && hourOfTheDay > 23) {
            return false;
        } else if( hourOfTheDay < 8 && hourOfTheDay > 22){
            return true;
        }
        else{
            return false;
        }
    }


}
