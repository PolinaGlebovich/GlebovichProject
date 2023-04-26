package classwork.Lesson10;

public class ExceptionExample {

    public static void main(String[] args) {
        int result;
        try {
            result = 2 / 1;
            try {
                result = 2 / 0;
            } catch (Exception i){

            }
        } catch (ArithmeticException|IndexOutOfBoundsException e){
            System.out.println("Oops, something bad");
            result = 0;
        } catch (Exception e){
            System.out.println("Oops, something bad");
            result = -1;
        }
        finally {
            System.out.println("This is end of try block!!!");
        }
        System.out.println(result);
    }
}
