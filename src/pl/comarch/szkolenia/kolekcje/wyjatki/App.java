package pl.comarch.szkolenia.kolekcje.wyjatki;

public class App {
    public static void main(String[] args) throws IncorrectNumberException {
        int[] tab = new int[10];
        try {
            String[] tab2 = new String[10];
            String s = tab2[5];
            s.toUpperCase();
            //??
            //??
        } catch (NullPointerException e) {
            System.out.println("cos");
        } catch (Exception e) {
            System.out.println("nie udalo sie !!");
        }

        System.out.println("Aplikacja robi dalej rzeczy !!");

        try {
            checkIfNumberIsBig(100);
            checkIfNumberIsBig(200);
            checkIfNumberIsBig(500);
            checkIfNumberIsBig(12341234);
            checkIfNumberIsBig(567456745);
        } catch (IncorrectNumberException e) {
            System.out.println("Podane liczby sa niepoprawne !!");
            e.printStackTrace();
        }

            checkIfNumberIsBig(100);
            checkIfNumberIsBig(200);
            checkIfNumberIsBig(500);
            checkIfNumberIsBig(12341234);
            checkIfNumberIsBig(567456745);

    }

    public static void checkIfNumberIsBig(int x)
            throws IncorrectNumberException {
        if(x < 1000000) {
            throw new IncorrectNumberException();
        }
    }
}
