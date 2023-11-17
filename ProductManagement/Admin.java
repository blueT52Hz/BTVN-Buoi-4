package ProductManagement;

import ProductManagement.Customer;

import java.util.Scanner;

public class Admin extends Customer {
    public static void menuModeAdmin() {
        System.out.println("" +
                "|------------------------------|\n" +
                "|  Chức năng Admin:            |\n" +
                "|  0. Đăng xuất.               |\n" +
                "|  1. Thêm sản phẩm.           |\n" +
                "|  2. Xóa sản phẩm.            |\n" +
                "|  3. Sửa sản phẩm.            |\n" +
                "|  4. Chức năng của khách.     |\n" +
                "|------------------------------|");
    }

    public static void chooseModeAdmin() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            menuModeAdmin();
            System.out.print("Chọn chức năng Admin: ");
            int mode = Integer.valueOf(sc.nextLine());
            if(mode==0) {
                System.out.println("Đăng xuất tài khoản Admin.");
                break;
            }
            if(mode==1) addProduct();
            if(mode==2) removeProduct();
            if(mode==3) editProductInfor();
            if(mode==4) chooseModeCustomer();
        }
    }
}
