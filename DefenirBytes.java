import java.math.BigDecimal;
import java.util.*;
public class DefenirBytes {
    public static void main(String[] args) {

        /*
    Kilobyte 1K = 1024 B [2^10] 1000
    Mega 1MB = 1024 KB [2^10*2^10] 1.000.000
    Giga 1GB = 1024 MB 1.000.000.000 2^10*3
    Tera 1TB = 1024 GB 1.000.000.000.000
    Peta 1PB = 1024 TB 1.000.000.000.000.000
    Exa 1EB = 1024 PB 1.000.000.000.000.000.000
    Zetta 1ZB = 1024 EB 1.000.000.000.000.000.000.000
    Yotta 1YB = 1024 ZB 1.000.000.000.000.000.000.000.000

    EX: 555 = 555.00B // 10000000 = 9.54MB

    int kilo = 1024;
        int mega = kilo * 1024;
        int giga = mega * 1024;
        BigDecimal tera = BigDecimal.valueOf(giga * 1024);
     */
        converter();
    }

    public static String converter() {
        Scanner scan = new Scanner(System.in);
        String conversao = String.valueOf(true);
        int kilo = 1024;
        int mega = kilo * 1024;
        int giga = mega * 1024;
        int tera = giga * 1024;
        int peta = tera * 1024;
        int exa = peta * 1024;
        int zetta = exa * 1024;
        int yotta = zetta * 1024;


        boolean chave = true;
        while (chave) {
            int escolha;
            int tamBytes;
            System.out.println("Insira o tamanho em Bytes");
            tamBytes = scan.nextInt();
            BigDecimal byteDecimal = new BigDecimal(tamBytes);

            System.out.println("Escolha uma conversão para BYTE:");
            System.out.print("(1) KiloByte\n(2) MegaByte\n(3) GigaByte\n(4) TeraByte\n(5) PetaByte");
            System.out.println("\n(6) ExaByte\n(7) ZettaByte\n(8) YottaByte");

            scan = new Scanner(System.in);
            escolha = scan.nextInt();


                    switch (escolha) {
                case 1:
                    BigDecimal k = new BigDecimal(kilo);
                    conversao = String.valueOf(byteDecimal.divide(k));
                    System.out.println(conversao);
                    break;

                case 2:
                    BigDecimal m = new BigDecimal(mega);
                    conversao = String.valueOf(byteDecimal.divide(m));
                    System.out.println(conversao);
                    break;

                case 3:
                    BigDecimal g = new BigDecimal(giga);
                    conversao = String.valueOf(byteDecimal.divide(g));
                    System.out.println(conversao);
                    break;

                case 4:
                    BigDecimal t = new BigDecimal(tera);
                    conversao = String.valueOf(byteDecimal.divide(t));
                    System.out.println(conversao);

                case 5:
                    BigDecimal p = new BigDecimal(peta);
                    conversao = String.valueOf(byteDecimal.divide(p));
                    System.out.println(conversao);
                    break;

                case 6:
                    BigDecimal e = new BigDecimal(exa);
                    conversao = String.valueOf(byteDecimal.divide(e));
                    System.out.println(conversao);
                    break;

                case 7:
                    BigDecimal z = new BigDecimal(zetta);
                    conversao = String.valueOf(byteDecimal.divide(z));
                    System.out.println(conversao);
                    break;

                case 8:
                    BigDecimal y = new BigDecimal(yotta);
                    conversao = String.valueOf(byteDecimal.divide(y));
                    System.out.println(conversao);
                    break;
            }
        }
        return null; 
    }
}
