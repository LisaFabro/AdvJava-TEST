public class Main {
    //Riprendi uno degli esercizi già svolti e corretti
    //Aggiungi Junit al progetto
    //Crea una funzione di test che non dia errori
    public static void main(String[] args) {
        System.out.println(funPotenza(-3,2));
    }
    public static double funPotenza(double num, double esp) {
        double result = 1;
        if (esp == 0) {
            result=1;
        } else if(esp<0){
            for (int i = 1; i <= Math.abs(esp); i++) {
                result *= 1/num;
            }
        }else{
            for (int i = 1; i <= esp; i++) {
                    result *= num;
                }
        }
        return result;
    }
}