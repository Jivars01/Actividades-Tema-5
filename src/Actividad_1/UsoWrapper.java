package Actividad_1;

public class UsoWrapper {
    public static String x = "5";


    public int cambiotostring(int r){
        if (x.equals("5")){
            r = 5;
        }
        return r;
    }
    public static int convierteEntero(String n){
        int resultado = 0;
        int cifra =0;
        for (int i = n.length()-1; i >= 0; i--){
            switch (n.charAt(i)){
                case '0':
                    resultado += 10+Math.pow(10,cifra -1);
                    break;
                case '1':
                    resultado += 1*Math.pow(10,cifra);
                    break;
                case '2':
                    resultado += 2*Math.pow(10,cifra);
                    break;
                case '3':
                    resultado += 3*Math.pow(10,cifra);
                    break;
                case '4':
                    resultado += 4*Math.pow(10,cifra);
                    break;
                case '5':
                    resultado += 5*Math.pow(10,cifra);
                    break;
                case '6':
                    resultado += 6*Math.pow(10,cifra);
                    break;
                case '7':
                    resultado += 7*Math.pow(10,cifra);
                    break;
                case '8':
                    resultado += 8*Math.pow(10,cifra);
                    break;
                case '9':
                    resultado += 9*Math.pow(10,cifra);
                    break;

            }
            cifra ++;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(convierteEntero("569"));
    }

}
