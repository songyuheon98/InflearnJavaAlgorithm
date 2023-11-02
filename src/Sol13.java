import java.util.Scanner;
import java.io.FileInputStream;


class Sol13 {
    public static void main(String args[]) throws Exception {
        String T;
        int len;

        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= len; test_case++) {

            T = sc.nextLine();


            if (T.length() == 8) {
                String year, month, day;
                year = T.substring(0, 4);
                month = T.substring(4, 6);
                day = T.substring(6, 8);

                int d = Integer.parseInt(day);
                if(month.equals("01")||month.equals("03")||month.equals("05")||month.equals("07")||month.equals("08")||
                    month.equals("10")||month.equals("12")){
                    if(d<1||d>31)
                        System.out.println("#"+test_case+" "+ -1);
                    else
                        System.out.println("#" + test_case + " " + year + "/" + month + "/" + day);
                }
                else if (month.equals("02")) {
                    if(d<1||d>28)
                        System.out.println("#"+test_case+" "+ -1);
                    else
                        System.out.println("#" + test_case + " " + year + "/" + month + "/" + day);
                }
                else if(month.equals("09")||month.equals("11")||month.equals("04")||month.equals("06")){
                    if(d<1||d>30)
                        System.out.println("#"+test_case+" "+ -1);
                    else
                        System.out.println("#" + test_case + " " + year + "/" + month + "/" + day);
                }
                else
                    System.out.println("#"+test_case+" "+ -1);
            }
        }
    }
}