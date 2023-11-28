




public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "petar pan je pojeo panprike i zato je pan petar";
        String rijec = "pan";
        boolean rijecJesteDioRecenice = false;
        int međa = recenica.length()-rijec.length();
        int kolikoPuta = 0;
        KOLEGA: for(int i = 0; i<=međa; i++){
            for(int j = 0; j<rijec.length(); j++){
                char slovoRecenice = recenica.charAt(i+j);
                char slovoRijeci = rijec.charAt(j);


                if(slovoRecenice != slovoRijeci)
                {
                    continue KOLEGA;

                }
            }
            /*
            Dvije linije koda ispod će se izvršavati samo i ako samo
            nikada se nije izvršila linija koda "continue KOLEGA;"
             */
            rijecJesteDioRecenice = true;
            kolikoPuta++;
            break;
        }
        String message = rijecJesteDioRecenice ? "rijec jeste":"riječ nije";
        System.out.println(kolikoPuta + " puta" + " " +message);
    }
}
