package bmi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {
    public static double calculateBMI(int w, int h) throws BMIException {
        if (h == 0)
            throw new BMIException("h = 0 là giá trị không hợp lệ ");
        double bmi = 0;
        double hei2 = h / 100.0;
        bmi += w / (hei2 * hei2);
        return bmi;
    }
    private static  boolean runBMI(){
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhập cân nặng: ");
            int w = sc.nextInt();
            if (w <= 0) {
                throw new BMIException("w<=0 không hợp lệ");
            }
            System.out.println("Nhập chiều cao: ");
            int h = sc.nextInt();
            if (h < 0) {
                throw new BMIException("h<0 không hợp lệ");
            }
            double bmi = calculateBMI(w, h);
            System.out.println("BMI = " + bmi);

            if (bmi < 18.5) {
                System.out.println("Gầy");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Bình thường");
            } else if (bmi >= 25 && bmi < 40) {
                System.out.println("Béo phì");
            }
            return true;
        } catch (BMIException e) {

            System.out.println(e);
            return  false;
        } catch (InputMismatchException e){
            System.out.println("Nhập số nguyên");

            return  false;

        }
    }
    public static void main(String[] args) {
        while (true) {
            boolean isCheck = runBMI();
            if(isCheck){
                break;
            }else{
                continue;
            }
        }

    }
}
