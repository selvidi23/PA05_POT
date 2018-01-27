import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int base = 0, exponent = 0, hmt=0, tmp = 0;
        double result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        hmt = Integer.parseInt(br.readLine());


        for (int i = 0 ;i<hmt; i++)
        {
            String line = br.readLine();
            String [] tab = line.split(" ");
            base = Integer.parseInt(tab[0]);
            exponent = Integer.parseInt(tab[1]);
            tmp = base%10;
            if(tmp==0 || tmp==1 || tmp == 5 || tmp == 6)
            {
                System.out.println(tmp);
            }
            else if(tmp == 4)
            {
                int tmp2 = exponent%2;
                if(tmp2==0)
                {
                    System.out.println("6");
                }
                else
                {
                    System.out.println("4");
                }
            }
            else if(tmp == 9)
            {
                int tmp2 = exponent%2;
                if(tmp2==0)
                {
                    System.out.println("1");
                }
                else
                {
                    System.out.println("9");
                }
            }
            else if(tmp == 2)
            {
                double tmp2= exponent%100;
                int rest = (int)tmp2%4;
                switch (rest)
                {
                    case 0:
                        System.out.println("6");
                        break;
                    case 1:
                        System.out.println("2");
                        break;
                    case 2:
                        System.out.println("4");
                        break;
                    case 3:
                        System.out.println("8");
                        break;
                }
            }
            else if(tmp == 3)
            {
                double tmp2= exponent%100;
                int rest = (int)tmp2%4;
                switch (rest)
                {
                    case 0:
                        System.out.println("1");
                        break;
                    case 1:
                        System.out.println("3");
                        break;
                    case 2:
                        System.out.println("9");
                        break;
                    case 3:
                        System.out.println("7");
                        break;
                }
            }
            else if(tmp == 7)
            {
                double tmp2= exponent%100;
                int rest = (int)tmp2%4;
                switch (rest)
                {
                    case 0:
                        System.out.println("1");
                        break;
                    case 1:
                        System.out.println("7");
                        break;
                    case 2:
                        System.out.println("9");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                }
            }
            else if(tmp == 8)
            {
                double tmp2= exponent%100;
                int rest = (int)tmp2%4;
                switch (rest)
                {
                    case 0:
                        System.out.println("6");
                        break;
                    case 1:
                        System.out.println("8");
                        break;
                    case 2:
                        System.out.println("4");
                        break;
                    case 3:
                        System.out.println("2");
                        break;
                }
            }


        }



    }
}
