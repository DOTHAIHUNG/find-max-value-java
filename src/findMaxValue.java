import java.util.Scanner;

public class findMaxValue {
    public static void main(String[] args) {
        int[] money = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < money.length; i++) {
            System.out.println("Nhap so tien cua ti phu " + (i + 1));
            money[i] = sc.nextInt();
        }
        System.out.println("Tai san cua cac ti phu la nhu sau: ");
        for (int i1 : money) {
            System.out.print(i1 + "\t");
        }

        System.out.println("Bay gio se hien thi ti phu co tai san lon nhat:");
        int max = money[0];
        int index = 1;
        for (int i2 = 0; i2 < money.length; i2++) {
            if (money[i2] > max) {
                max = money[i2];
                index = i2 + 1;
            }
        }
        System.out.println("Luong tai san lon nhat la " + max + " cua ti phu " + index);
    }
}
