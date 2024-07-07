import java.util.*;

public class minMaxDizi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Dizi boyutunu giriniz : ");
        int diziBoyutu = input.nextInt();

        int[] list = new int[diziBoyutu];

        for (int i = 0 ; i< list.length ; i++){
            System.out.print((i+1) + ". elemanı giriniz : ");
            list[i] = input.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println("list["+i+"]="+list[i]);
        }

        //int[] list = {17,-67,8,-9,5,-17,82};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min)
                min = i;

            if (i > max)
                max = i;
        }

        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(list));
        System.out.println();
        System.out.println("Minimum değer = " + min);
        System.out.println("Maksimum değer = " + max);

    }
}