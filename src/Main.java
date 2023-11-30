public class Main {
    public static void main(String[] args){

        division(25,5);
        division(30,null);
    }

    public static int division(Integer numeratore, Integer denominatore){
        int result = numeratore / denominatore;

        try{
            if (numeratore == null) {
                throw new ArithmeticException("Errore");
            } else if (denominatore == null) {
                throw new ArithmeticException("Errore");
            }
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        return result;

    }
}






