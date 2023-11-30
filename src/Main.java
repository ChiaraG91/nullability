public class Main {
    public static void main(String[] args){

        division(25,5);
        division(30,null);
    }

    public static int division(Integer numeratore, Integer denominatore){
        int result = numeratore / denominatore;
            if (numeratore == null) {
                throw new IllegalArgumentException("Errore");
            } else if (denominatore == null) {
                throw new IllegalArgumentException("Errore");
            }
        return result;
    }
}







